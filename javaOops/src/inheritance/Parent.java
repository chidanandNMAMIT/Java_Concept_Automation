package inheritance;

public class Parent {

	int a;
	int b;
	static int c=40;
	
	Parent(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	void disp() {
		System.out.println("parent class disp method");
	}
	
	static void print() {
		System.out.println("parent class print method");
	}
	
	
}
