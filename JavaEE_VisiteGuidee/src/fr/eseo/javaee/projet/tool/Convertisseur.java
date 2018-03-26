package fr.eseo.javaee.projet.tool;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Convertisseur {

	public static Date asUtilDate(XMLGregorianCalendar calendar) {
		return calendar.toGregorianCalendar().getTime();
	}

	public static XMLGregorianCalendar asXMLGregorianCalendar(Date date) {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(date);
		XMLGregorianCalendar xmlDate = null;
		try {
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return xmlDate;
	}
}
