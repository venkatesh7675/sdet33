package com.crm.genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility 
{
	static Properties properties;

	public static void initialize(String path) throws IOException 
	{
		FileInputStream fis=new FileInputStream(path);
		properties=new Properties();
		properties.load(fis);
	}
	public static String fetchString(String key)
	{
		String value = properties.getProperty(key);
		return value;
	}
}