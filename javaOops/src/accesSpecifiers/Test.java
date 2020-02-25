package accesSpecifiers;

public class Test  {

	public static void main(String[] args) {

//		PriveteDemo obj1 = new PriveteDemo(30, 40);
//		 System.out.println(obj1.a+" "+ obj1.b);

		PackageDemo obj2 = new PackageDemo(30, 40);
		 System.out.println(obj2.a+" "+ obj2.b);

		ProtectedDemo obj3 = new ProtectedDemo(100, 200);
		System.out.println(obj3.a + " " + obj3.b);
	}
}
