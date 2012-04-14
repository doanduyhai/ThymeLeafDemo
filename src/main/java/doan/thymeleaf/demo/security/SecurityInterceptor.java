package doan.thymeleaf.demo.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.expression.WebSecurityExpressionRoot;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SecurityInterceptor extends HandlerInterceptorAdapter
{
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
	{
		if (modelAndView != null)
		{
			ServletRequest req = (ServletRequest) request;
			ServletResponse resp = (ServletResponse) response;
			FilterInvocation filterInvocation = new FilterInvocation(req, resp, new FilterChain()
			{
				public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException
				{
					throw new UnsupportedOperationException();
				}
			});

			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (authentication != null)
			{
				WebSecurityExpressionRoot sec = new WebSecurityExpressionRoot(authentication, filterInvocation);
				sec.setTrustResolver(new AuthenticationTrustResolverImpl());
				modelAndView.getModel().put("sec", sec);
			}
		}
	}
}
