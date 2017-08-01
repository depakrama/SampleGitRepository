package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidator {
	
	private Pattern pattern;
	private Matcher matcher;
	

private static final String IPADDRESS_PATTERN =  "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." 
+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." 
		+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." 
+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"; 

	
	public List<String> validate() {
		List<String> invalidIpAddress = new ArrayList<String>();
		pattern = Pattern.compile(IPADDRESS_PATTERN);
		URL path = IpValidator.class.getResource("ipfile");

		//URL url = getClass().getResource("ipfile.txt");
		File ipAddressFile = new File(path.getFile());
		//File directory = new File("./");
		   //System.out.println(directory.getAbsolutePath());
		Scanner reader = null;
		try {
			reader = new Scanner(ipAddressFile);
			reader.useDelimiter("\r\n");
			while (reader.hasNext()) {
			    String line = reader.next();
			    
			    matcher = pattern.matcher(line);
			    if(!matcher.matches()){
			    	invalidIpAddress.add(line);
			    }
			    
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if(reader != null){
				reader.close();
			}
			
		}
		
		return invalidIpAddress;
		
	}
	
}
