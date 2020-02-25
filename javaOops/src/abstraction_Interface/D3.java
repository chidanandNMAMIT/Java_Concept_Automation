package abstraction_Interface;

public class D3 implements A3,B3,C3{

	@Override
	public void disp() {
		System.out.println("disp mithod");
		
	}
	
public static void main(String[] args) {
	D3 d=new D3();
	d.disp();
	System.out.println(A3.a);
	}

}
