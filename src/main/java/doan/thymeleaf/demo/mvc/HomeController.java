package doan.thymeleaf.demo.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import doan.thymeleaf.demo.domain.Artist;
import doan.thymeleaf.demo.domain.Search;
import doan.thymeleaf.demo.domain.User;

@Controller
public class HomeController
{

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model)
	{
		return "pages/login";
	}

	@RequestMapping(value =
	{
			"/",
			"/example1"
	}, method = RequestMethod.GET)
	public String example1(Model model)
	{
		model.addAttribute("currentUser", new User("foobar", "Foo", "BAR", ""));
		return "pages/example1";
	}

	@RequestMapping(value = "/example2", method = RequestMethod.GET)
	public String setupForm(Model model)
	{
		model.addAttribute("styleList", this.getStyleList());
		model.addAttribute("countryList", this.getCountryList());
		model.addAttribute("search", new Search());
		return "pages/example2";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String doSearch(@ModelAttribute("search") Search search, Model model)
	{
		model.addAttribute("styleList", this.getStyleList());
		model.addAttribute("countryList", this.getCountryList());
		model.addAttribute("search", search);
		model.addAttribute("results", this.getResults());
		return "pages/example2";
	}

	@RequestMapping(value = "/example3", method = RequestMethod.GET)
	public String example3(Model model)
	{
		model.addAttribute("realText", "This is the real <strong>unescaped</strong> text at runtime");
		model.addAttribute("realEscapedText", "This is the real <strong>escaped</strong> text at runtime");

		model.addAttribute("switchCase", 2);

		model.addAttribute("dataUrl", "http://www.thymeleaf.org");
		model.addAttribute("realTitle", "Link to ThymeLeaf");

		model.addAttribute("nameInput", "Put your name here");

		model.addAttribute("listArtits", this.getResults());

		return "pages/example3";
	}

	@RequestMapping(value = "/example4", method = RequestMethod.GET)
	public String example4(Model model)
	{
		return "pages/example4";
	}

	@RequestMapping(value = "/example5", method = RequestMethod.GET)
	public String example5(Model model)
	{
		model.addAttribute("listArtits", this.getResults());
		return "pages/example5";
	}

	@RequestMapping(value = "/example6", method = RequestMethod.GET)
	public String example6(Model model)
	{
		return "pages/example6";
	}

	@RequestMapping(value = "/example7", method = RequestMethod.GET)
	public String example7(Model model)
	{
		return "pages/example7";
	}

	private List<String> getStyleList()
	{
		return Arrays.asList("Rock", "Pop", "Metal", "House", "RnB", "Dance", "Country", "Techno", "Classical");
	}

	private List<String> getCountryList()
	{
		return Arrays.asList("United States", "United Kingdom", "China", "Japan", "France", "Spain", "Germany", "Canada", "Australia");
	}

	private List<Artist> getResults()
	{
		List<Artist> results = new ArrayList<Artist>();

		results.add(new Artist(
				"Mariah",
				"Carrey",
				Arrays.asList("Mariah Carey", "Emotions", "Music Box", "Merry Christmas", "DayDream", "ButterFly"),
				"Mariah Carey (born March 27, 1970) is an American singer, songwriter, record producer, and actress. She made her recording debut in 1990 under the guidance of Columbia Records executive Tommy Mottola, and released her self-titled debut studio album, Mariah Carey.",
				true));

		results.add(new Artist(
				"Elvis",
				"Presley",
				Arrays.asList("Elvis Presley", "Elvis", "Loving You", "Elvis' Christmas Album", "Elvis Is Back!", "G.I. Blues"),
				"Elvis Aaron Presleya (January 8, 1935 – August 16, 1977) was one of the most popular American singers of the 20th century. A cultural icon, he is widely known by the single name Elvis. He is often referred to as the 'King of Rock and Roll' or simply 'the King'.",
				false));

		results.add(new Artist(
				"John",
				"Lennon",
				Arrays.asList("John Lennon", "Imagine", "Some Time in New York City", "Mind Games", "Walls and Bridges", "Rock 'n' Roll"),
				"John Winston Lennon (9 October 1940 – 8 December 1980) was an English musician and singer-songwriter who rose to worldwide fame as one of the founding members of The Beatles, one of the most commercially successful and critically acclaimed acts in the history of popular music. Along with fellow Beatle Paul McCartney, he formed one of the most successful songwriting partnerships of the 20th century.",
				false));
		return results;
	}
}
