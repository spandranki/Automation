package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\sameera\\eclipse-workspace\\Automation\\src\\Automation\\demo.properties");
		
		p.load(f);
		
		System.out.println(p.getProperty("name"));
		
		
		
		

	}
	
	
	

}
