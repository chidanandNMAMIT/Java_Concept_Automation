package abstraction_Interface;

public class C2 extends B2 {
	
	public void disp2() {
		System.out.println("disp2 method");
	}
	
	public static void main(String[] args) {
		C2 c=new C2();
		c.disp1();
		c.disp2();
	}
}
