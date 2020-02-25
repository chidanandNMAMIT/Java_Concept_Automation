package java_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileOutpuStream implements Serializable {
	public static void main(String[] args) {
		Student st=new Student(100,"ram","ggg");
		
		
		try {
			FileOutputStream fos=new FileOutputStream("Student.ser");
			
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			
		} catch (IOException e) {
			e.printStackTrace();
		
		
		}
		
		
	}
	
	
	
	 

}
