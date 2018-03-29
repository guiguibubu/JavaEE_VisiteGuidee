package fr.eseo.javaee.projet.tool;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Convertisseur {

	private static final String DATE_FORMATTER_STRING = "yyyy-MM-dd";
	private static final String DATE_TIME_FORMATTER_STRING = "yyyy-MM-dd HH:mm:ss";
	private static final DateFormat dateFormatter = new SimpleDateFormat(DATE_FORMATTER_STRING);
	private static final DateFormat dateTimeFormatter = new SimpleDateFormat(DATE_TIME_FORMATTER_STRING);

	public static Date asUtilDate(XMLGregorianCalendar calendar) {
		return calendar.toGregorianCalendar().getTime();
	}

	public static String asStringForView(XMLGregorianCalendar calendar) {
		return dateTimeFormatter.format(asUtilDate(calendar));
	}

	public static XMLGregorianCalendar asXMLGregorianCalendar(Date date) {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		c.setTimeZone(TimeZone.getDefault());
		XMLGregorianCalendar xmlDate = null;
		try {
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlDate;
	}

	public static XMLGregorianCalendar asXMLGregorianCalendar(String dateText) {
		Date date = null;
		XMLGregorianCalendar xmlDate = null;
		try {
			date = dateFormatter.parse(dateText);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		if(date == null) {
			try {
				date = dateFormatter.parse("1900-01-01");
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
		return asXMLGregorianCalendar(date);
	}

	public static int asInt(String numberText) {
		int number = -1;
		try {
			number = Integer.parseInt(numberText);
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		}
		return number;
	}
}
