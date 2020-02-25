package TestClass;

public class parentClass {

	// to prevent inheritance we use final keyword
	// to prevent method overidding
	int a, b;

	private void start() {
		System.out.println("parent ...method");
	}

	void start(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("child ...method");
	}

}
