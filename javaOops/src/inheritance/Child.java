package inheritance;

public class Child extends Parent{
	
	int d;
	
	Child(int a, int b , int d) {
		super(a, b);
		this.d=d;	
	}
	
	public static void main(String[] args) {
		Child c=new Child(10,20,30);
		System.out.println(c.a+" "+c.b+" "+c.d);
		c.disp();
		Parent.print();
		System.out.println(Parent.c);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

	
	
}
