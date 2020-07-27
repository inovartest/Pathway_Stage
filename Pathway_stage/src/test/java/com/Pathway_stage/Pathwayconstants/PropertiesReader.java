package com.Pathway_stage.Pathwayconstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import java.util.ResourceBundle;

import com.google.errorprone.annotations.DoNotCall;



public  final class PropertiesReader 
{

	/*private static Properties properties = null;

	

	private PropertiesReader() {
	}

	private static ResourceBundle rb;
	
	static {
		
		rb = ResourceBundle.getBundle("config");
		
	}

	*//**
	 * @param key
	 * @return
	 *//*
	public static String getProperty(String key) {

		return rb.getString(key);
	}

	@DoNotCall
	public static Properties read() {
		if (Objects.nonNull(properties)) {
			return properties;

		}
		properties = new Properties();
		//String root = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String path = "F:\\stage\\Pathway_stage\\config.properties";

		try {
			properties.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		return properties;

	}*/
	public static 	Properties prop;
	public static FileReader reader;
	public String fileread()
	{
	
		try {
			 reader = new FileReader("F:\\stage\\Pathway_stage\\config.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return prop.getProperty("UserName");
		
}
	public String usernamesheet()
	{
		fileread();
		return prop.getProperty("username");
		
		}
	public String sitedata() {
		fileread();
		return prop.getProperty("sitedeatils");
	}
}
