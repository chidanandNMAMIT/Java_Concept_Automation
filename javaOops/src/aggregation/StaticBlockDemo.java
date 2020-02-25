package aggregation;

// static block used for initialising static variables,static block executes first when class is loaded
//it can have multiple static blocks, which will executes in the sequence
// static blocks are executed before constructor
// before java 1.7 version it was supporting later version not supported

public class StaticBlockDemo  {

	static int a;
	
	static {
		a = 10;
		System.out.println(a);
		System.out.println("static block1 executed");
	}
	
	static {
		a = 20;
		System.out.println(a);
		System.out.println("static block2 executed");
	}
	
	public static void main(String[] args) {
		System.out.println("main method executed");
	}
}
