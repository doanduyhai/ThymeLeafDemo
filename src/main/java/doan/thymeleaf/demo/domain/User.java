package doan.thymeleaf.demo.domain;

public class User
{
	private String login;

	private String firstName;

	private String lastName;

	private String gravatar;

	public User(String login, String firstName, String lastName, String gravatar) {
		super();
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gravatar = gravatar;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getGravatar()
	{
		return gravatar;
	}

	public void setGravatar(String gravatar)
	{
		this.gravatar = gravatar;
	}

}
