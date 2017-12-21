module org.lompo.dive.deep.ninth.life {
	requires java.xml.bind;
	requires jdk.incubator.httpclient;
	requires java.base;
	exports org.lompo.dive.deep.ninth.life.serial.xml to java.xml.bind;
	exports org.lompo.dive.deep.ninth.life;
	
}