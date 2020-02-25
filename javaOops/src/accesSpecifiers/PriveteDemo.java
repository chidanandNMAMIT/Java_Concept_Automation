package accesSpecifiers;


// if we declare methods and variables as private we can acccess only within the class

public class PriveteDemo {
	private int a,b;
	
	PriveteDemo(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		
		PriveteDemo obj=new PriveteDemo(10,20);
		System.out.println(obj.a+ " "+ obj.b);
	
		
	}
}
