package doan.thymeleaf.demo.util;

import java.util.Date;

import org.joda.time.DateTime;

public class DateFormatter
{
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public String getCurrentDate()
	{
		return new DateTime(new Date()).toString(DATE_FORMAT);
	}
}
