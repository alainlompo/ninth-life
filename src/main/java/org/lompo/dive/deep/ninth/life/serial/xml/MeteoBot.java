package org.lompo.dive.deep.ninth.life.serial.xml;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MeteoBot {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jaxb = JAXBContext.newInstance(WeatherServiceImpl.class);
		Marshaller marshaller = jaxb.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
		StringWriter writer = new StringWriter();
		marshaller.marshal(new WeatherServiceImpl(), writer);
		System.out.println(writer.toString());
	}
}
