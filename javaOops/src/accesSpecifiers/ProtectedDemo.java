package accesSpecifiers;


// if we declare methods and variables as protected we can access within class 
// outside class and outside package throgh interface

public class ProtectedDemo {

	 protected int a;
	 protected int b;
	 public ProtectedDemo(int a, int b){
		 this.a=a;
		 this.b=b;
		
	 }
	 public static void main(String[] args) {
		 ProtectedDemo obj=new ProtectedDemo(50,60);
		 System.out.println(obj.a+" "+ obj.b);
	}
}
