package typeCasting;

public class ClassCasting2  extends ClassCasting1{
	
	void print() {
		System.out.println("ClassCasting2 print method");
	}
	
	public static void main(String[] args) {
		
		ClassCasting1 obj=new ClassCasting2();//upcasting
		
		ClassCasting1 obj1= (ClassCasting1)obj;
		
	}
	

}
