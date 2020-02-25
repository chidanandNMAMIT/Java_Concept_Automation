package javaConcepts1;

// super is used to call immediate parent class instance variable.
//super is used to call immediate parent class constructor.
//super keyword is should be written in child class
//super can be used to invoke parent class method

public class SuperKeyword2 extends Superkeyword1 {

	public SuperKeyword2() {
		super(10);
		System.out.println("parent class variable :"+super.age);
		
		System.out.println("child class constructor");
		super.disp();
	}

	public static void main(String[] args) {
		
		SuperKeyword2 obj=new SuperKeyword2();
		obj.disp();
	}

}
