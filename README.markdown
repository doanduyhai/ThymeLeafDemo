ThymeLeaf Demo
================

Presentation
------------------

 This is a demo project for ThymeLeaf integration with Spring MVC 3.
 
 This demo is a support for the following articles
 
  [Spring MVC part III: ThymeLeaf integration] (http://doanduyhai.wordpress.com/2012/04/14/spring-mvc-part-iii-thymeleaf-integration/)
 
  [Spring MVC part VI: ThymeLeaf advanced usage] (http://doanduyhai.wordpress.com/2012/04/14/spring-mvc-part-vi-thymeleaf-advanced-usage/)
  
 The official website for ThymeLeaf project is [here](http://www.thymeleaf.org)
 
 Installation
------------

- Install [Maven 3](http://maven.apache.org/)
- Compile the project with mvn clean install
- Run Jetty from Maven : mvn jetty:run

 Usage
------------

- Connect to the application at http://127.0.0.1:8080/ThymeleafDemo/

The default users are "ddoan/password" but you can change it in the applicationContext-security.xml file

- All examples can be accessed by the URL http://127.0.0.1:8080/ThymeleafDemo/example[N] where [N] ranges from 1 to 7

Note: there is currently no "Logout" link to log out from the application. The security layer & login feature have been added to illustrate ThymeLeaf integration with Spring Security. To logout properly, you can just type http://127.0.0.1:8080/ThymeleafDemo/logout
