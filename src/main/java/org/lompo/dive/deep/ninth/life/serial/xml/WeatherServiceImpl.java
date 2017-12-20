package org.lompo.dive.deep.ninth.life.serial.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherServiceImpl implements WeatherService {
	@XmlElement
	public String getWeatherInfo(int dayIndex) {
		if (dayIndex == 6)  {
			return "Sunny and beautiful day";
		}
		return "Ordinary day, maybe a little gray, maybe partly sunny";
	}

}
