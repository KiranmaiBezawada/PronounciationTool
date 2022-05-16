package com.wellsfargo.pronunciation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	static Properties properties;
	
	public PropertyReader() {
		loadAllProperties();
	}
	
	public void loadAllProperties() {
	try {
		String fileName=System.getProperty("user.dir")+"/pronunciation/src/main/resources/application.properties";
		properties.load(new FileInputStream(fileName));
	}
	catch(IOException e) {
		throw new RuntimeException("Not able to find the file");
	}
	}
	public static String readItem(String propertyName) {
		return properties.getProperty(propertyName);
		
	}
}
