package java_io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
	
	public static void main(String[] args) {
		try {
		
		Employee_serialize emp=new Employee_serialize(101, "Raghu");
		
		 FileOutputStream fout=new FileOutputStream("F:\\chidanand\\javaIO\\Student1.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout); 
		
		  out.writeObject(emp);  
		  out.flush();
		  out.close();
		  System.out.println("success");
		  
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
