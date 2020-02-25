package javaConcepts1;

public class finallyConcept {

	public static void main(String[] args) {
		//test1();
		division();

	}

	// finally keyword is always used with try-catch block
	// it does not matter exception is coming or not finally block will be executed
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {

			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally block");
		}

	}
	
	// test2
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k=i/0;
		}catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("devide by zero error");
		}
		finally {
			System.out.println("execute this code even after any exception");
		}
	}

}
