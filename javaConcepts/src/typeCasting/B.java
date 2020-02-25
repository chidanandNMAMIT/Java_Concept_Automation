package typeCasting;

public class B extends A {

	void disp1() {
		System.out.println("clas B disp method");
	}

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new B();
		A a3 = null;

		System.out.println((a1 instanceof A));

		System.out.println((a2 instanceof A));
		System.out.println((a2 instanceof B));
		System.out.println((a3 instanceof A));
		
		
		

	}

}
