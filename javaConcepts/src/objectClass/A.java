package objectClass;

public class A {

	public static void main(String[] args) {
		Object obj1=new Object();
		System.out.println(obj1.getClass().getName());
		System.out.println(obj1.hashCode()); // it will return unique hashcode 10 digits
		System.out.println(obj1.toString());
		//System.out.println(obj1.equals(arg0));
		Object obj2=new A();
		System.out.println(obj2.getClass());
		System.out.println(obj2.toString());
		
		
		
		
		
	}
}
