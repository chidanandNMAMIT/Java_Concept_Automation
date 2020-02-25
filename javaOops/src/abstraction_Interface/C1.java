package abstraction_Interface;

public class C1 implements B1 {

	@Override
	public void disp1() {
	
		System.out.println("disp1 method");
	}

	@Override
	public void disp2() {
		System.out.println("disp2 method");
		
	}
	
	public static void main(String[] args) {
		C1 c=new C1();
		c.disp1();
		c.disp2();
	}

}
