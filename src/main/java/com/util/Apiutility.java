package com.util;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Apiutility {
	 public static RequestSpecification request;
	 public static Logger logger;
	
	public RequestSpecification requestdetails() throws IOException {
		
		if(request==null) {
			logger = Logger.getLogger(Apiutility.class);
			PropertyConfigurator.configure("C:\\Users\\edwin\\Moneycontrolsworkspace\\HybridPHPAPIRESTASSURED\\src\\test\\resources\\Log4j\\log4j.properties");
		
		
		PrintStream log=new PrintStream(new FileOutputStream("logdetails.txt"));
	    request=new RequestSpecBuilder().
	    		
			setBaseUri(getConfigvalues("baseuri")).
			addFilter(RequestLoggingFilter.logRequestTo(log)).
			addFilter(ResponseLoggingFilter.logResponseTo(log)).

			
			setContentType(ContentType.JSON).build();
	    
return request;		
	}return request;}
	
	
	public  static String getConfigvalues(String key) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\edwin\\Moneycontrolsworkspace\\HybridPHPAPIRESTASSURED\\src\\test\\resources\\properties\\config.properties");
         prop.load(fis);	
        return prop.getProperty(key);
         

	}

}
