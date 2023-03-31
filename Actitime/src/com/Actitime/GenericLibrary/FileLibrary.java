package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class is a generic class which is have nonstatic methods to perform data-driven testing
 * @author diyah
 *
 */
public class FileLibrary {
	
public String readDataFromProperty(String key) throws IOException  {
	 FileInputStream fis=new FileInputStream("./TestData/commondata.property");
	 Properties p=new Properties();
	 p.load(fis);
	    String value = p.getProperty(key);
	    return value;
	    
	 		
 }
 

}
