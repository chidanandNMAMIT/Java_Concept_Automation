package accesSpecifiers;

// if you declare methods and variables as public we access any where

public class PublicDemo {

	int a;
	int b;
	
	public PublicDemo(int a, int b) {
		this.a=a;
		this.b=b;
	}

	
	public static void main(String[] args) {
		PublicDemo obj=new PublicDemo(20,15);
		System.out.println(obj.a+" "+obj.b);
	}
}
