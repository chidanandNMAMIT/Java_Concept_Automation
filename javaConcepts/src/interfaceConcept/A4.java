package interfaceConcept;

public class A4 implements A, A1, A2 {

	@Override
	public void disp() {
		System.out.println("A4 Class");

	}

	@Override
	public void disp1() {
		System.out.println("A2 class");

	}

	public static void main(String[] args) {
		A4 a = new A4();
		a.disp();
		a.disp1();

	}

}
