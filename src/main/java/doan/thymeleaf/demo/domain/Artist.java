package doan.thymeleaf.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Artist
{

	private String firstname;

	private String lastname;

	private List<String> discography = new ArrayList<String>();

	private String bio;

	private boolean alive;

	public Artist(String firstname, String lastname, List<String> discography, String bio, boolean alive) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.discography = discography;
		this.bio = bio;
		this.alive = alive;
	}

	public String getName()
	{
		return this.firstname + ' ' + this.lastname;
	}

	public List<String> getDiscography()
	{
		return discography;
	}

	public String getBio()
	{
		return bio;
	}

	public boolean isAlive()
	{
		return alive;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

}
