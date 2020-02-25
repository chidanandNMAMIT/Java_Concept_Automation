package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		// int b[] = new int[3]; static array
		// b[0] = 10;
		// b[1] = 20;

		ArrayList arr = new ArrayList();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(12.33);
		arr.add("test");
		arr.add("selenium");
		arr.add("selenium");
		arr.add(null);
		arr.add(null);
		arr.add(30);

		// 1. dynamic array-----> ArrayList impliments list interface
		// 2. can contain duplicate values/element
		// 3. maintains insertion order
		// 4. ArrayList contains null values
		// non synchrinised
		//If any element is removed/added from the array, all the bits are shifted in memory.
		//ArrayList is better for storing and accessing data.
		// 5. it allows random access to fetch the element bcz it stores the values on
		// the bases of index

		System.out.println(arr.size()); // get the total arrayList
		System.out.println(arr.get(3)); // to get the value from an index

		// to print all the values from the arryList
		
		System.out.println("***** forloop ****");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		System.out.println("***** foreach loop ****");
		for (Object ob : arr) {
			System.out.println(ob);
		}

		System.out.println("***** Iterator ****");

		Iterator it1 = arr.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("***** while loop ****");
		int num=0;
		while(arr.size()>num) {
			System.out.println(arr.get(num));
			num++;
		}
		// Generi vs non Generic (Generics is using only one datatype - only int , only
		// string)

		ArrayList<Integer> arr1 = new ArrayList<Integer>();

		arr1.add(100);
		arr1.add(1233);

		ArrayList<String> arr2 = new ArrayList<String>();

		arr2.add("wel come to selenium");
		arr2.add("selenium test");

		// employe class object (user defined)

		Employe e1 = new Employe("naveen", "Qa", 27);
		Employe e2 = new Employe("aravind", "dev", 38);
		Employe e3 = new Employe("Ramana", "admin", 56);

		ArrayList<Employe> arr4 = new ArrayList<Employe>();

		arr4.add(e1);
		arr4.add(e2);
		arr4.add(e3);

		// iterator to traverse the values
		Iterator<Employe> it = arr4.iterator();

		while (it.hasNext()) {
			Employe emp = it.next();
			System.out.println(emp.age + " " + emp.name + " " + emp.dept);

		}

		System.out.println("** addAll **");

		// addAll
		ArrayList<String> arr3 = new ArrayList<String>();

		arr3.add("selenium");
		arr3.add("test");
		arr3.add("QTP");

		ArrayList<String> arr5 = new ArrayList<String>();

		arr5.add("java");
		arr5.add("phython");
		arr5.add("Ruby");

		arr3.addAll(arr5);

		for (int i = 0; i < arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}

		// RemoveAll
		System.out.println("**** RemoveAll *****");

		arr3.removeAll(arr5);
		for (int i = 0; i < arr3.size(); i++) {
			System.out.println(arr3.get(i));
		}
		
		System.out.println("**** RetainAll() ****");

		// RetainAll(): common part

		ArrayList<String> arr6 = new ArrayList<String>();

		arr6.add("selenium");
		arr6.add("test");
		arr6.add("QTP");

		ArrayList<String> arr7 = new ArrayList<String>();

		arr7.add("test");
		arr7.add("phython");
		arr7.add("Ruby");

		arr6.retainAll(arr7);
		for (int i = 0; i < arr6.size(); i++) {
			System.out.println(arr6.get(i));

		}

	}

}
