package com.Flipkart.GenericRepository;

import java.io.FileInputStream;
import java.util.Properties;


public class DataHandlerUtility {
	private static FileInputStream fis;
	private static Properties pobj=new Properties();
	public String getDataFromProperty(String key) throws Exception
	{
		 fis=new FileInputStream(AutomationConstant.PROP_PATH);
		pobj.load(fis);
		return pobj.getProperty(key);
	}

}
