package TestClass;

public class Parsing {
	int a = 100;

	public static void main(String[] args) {

		String a = "200A";
		try {
			int p = Integer.parseInt(a);
			System.out.println(p);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
			System.out.println(e);
			
			System.out.println(e.getMessage());
		}

	}
}
