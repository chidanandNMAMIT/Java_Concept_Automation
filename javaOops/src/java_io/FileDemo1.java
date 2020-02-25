package java_io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		
		File f=new File("F:\\chidanand\\chida questions\\ABCFile\\abc.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file got created");
			}else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
