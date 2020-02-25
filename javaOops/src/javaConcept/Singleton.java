package javaConcept;

public class Singleton {
	
	//Create an instance of the class at the time of class loading
	private static Singleton s=new Singleton();
	
	//private constructor to prevent others from instantiating this class
	private Singleton() {
		
	}
	
	//Provide a global point of access to the instance
	public static Singleton getinstance() {
		return s;
		
	}
	
	protected static void demoMethod() {
		System.out.println("demo method for Singleton class");
	}
	

}
