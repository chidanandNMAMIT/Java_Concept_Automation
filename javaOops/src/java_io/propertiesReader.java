package java_io;

import java.io.FileInputStream;
import java.util.Properties;

public class propertiesReader {

	public static void main(String[] args) {

		Properties p = new Properties();
		
		try {
			
			p.load(new FileInputStream("F:\\chidanand\\java naveenautomation labs\\javaOops\\src\\java_io\\Config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("email"));
	}

}
