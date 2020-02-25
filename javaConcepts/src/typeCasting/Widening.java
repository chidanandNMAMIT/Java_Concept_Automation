package typeCasting;

public class Widening {

	// A Type casting in Java is used to convert objects or variables of one type
	// into another
	public static void main(String[] args) {

		byte b = 10;
		short s = b;
		int i = s; // implicit widening (Automatic Type Conversion) the target type is larger than
					// source type.
		long l = i;
		float f = l;
		double d = f;

		System.out.println("byte value : " + b);
		System.out.println("short value : " + s);
		System.out.println("int value : " + i);
		System.out.println("long value : " + l);
		System.out.println("float value : " + f);
		System.out.println("double value : " + d);

		

	}

}
