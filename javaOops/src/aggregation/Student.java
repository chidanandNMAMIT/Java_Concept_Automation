package aggregation;


//Aggregation is a special form of association. It is a relationship between two classes(aggregate class contains a reference to another class)
//consider two classes Student class and Address class.
//Every student has an address so the relationship between student and address is a Has-A relationship.
//But if you consider its vice versa then it would not make any sense
//as an Address doesn’t need to have a Student necessarily.

public class Student {

	int id;
	String name;
	Address address;

	Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void disp() {
		System.out.println(id + " " + name);
		System.out.println(address.area + " " + address.street + " " + address.zipcode);
	}

	public static void main(String[] args) {
		Address obj = new Address("whitefield", "street1", 560065);
		Student st = new Student(100, "arun", obj);
		st.disp();
		
		Address obj2=new Address("marathhalli","munekolal",560037);
		Student st1 = new Student(101, "raj", obj2);
		st1.disp();

   	}
}
