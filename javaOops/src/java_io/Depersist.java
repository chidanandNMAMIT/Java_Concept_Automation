package java_io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String args[]) {
		
		try {
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("F:\\chidanand\\javaIO\\Student1.txt"));
			Employee_serialize emp = (Employee_serialize) in.readObject();
			// printing the data of the serialized object
			System.out.println(emp.id + " " + emp.name);
			// closing the stream
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
