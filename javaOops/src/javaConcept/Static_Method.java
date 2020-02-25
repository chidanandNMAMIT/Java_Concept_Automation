package javaConcept;

public class Static_Method {
	
	static String collegeName="NMAMIT";
	int rollno;
	String StudentName;
	
	

	public Static_Method(int rollno, String studentName) {
		this.rollno = rollno;
		this.StudentName = studentName;
	}
	
	static void disp(Static_Method s) {
		System.out.println(s.rollno);
		System.out.println(s.StudentName);
		System.out.println(collegeName);
	}



	public static void main(String[] args) {
		
		Static_Method s1=new Static_Method(100, "ARUN");
			disp(s1);
		Static_Method s2=new Static_Method(101, "SHIVA");
		     disp(s2);
	}

}
