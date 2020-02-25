package java_io;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
	
		File file = new File("F:\\chidanand\\chida questions\\ABCFile");
	    if (!file.exists()) {
	        if (file.mkdir()) {
	            System.out.println("Directory is created!");
	        } else {
	            System.out.println("Failed to create directory!");
	        }
	    }
	}

}
