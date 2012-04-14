package doan.thymeleaf.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Artist
{

	private String name;

	private List<String> discography = new ArrayList<String>();

	private String bio;

	public Artist(String name, List<String> discography, String bio) {
		super();
		this.name = name;
		this.discography = discography;
		this.bio = bio;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<String> getDiscography()
	{
		return discography;
	}

	public void setDiscography(List<String> discography)
	{
		this.discography = discography;
	}

	public String getBio()
	{
		return bio;
	}

	public void setBio(String bio)
	{
		this.bio = bio;
	}

}
