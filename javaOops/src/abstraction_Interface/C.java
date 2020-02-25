package abstraction_Interface;
	
	public class C extends B {

	void disp2() {
		System.out.println("disp2 method");
	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.disp1();
		c1.disp2();
		c1.print();
		
		System.out.println(A.a);
		
		
	
		A.show();
	}
}
