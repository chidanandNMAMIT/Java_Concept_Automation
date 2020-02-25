package listConcept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListConcept {

	public static void main(String[] args) {
		// 1. dynamic array-----> LinkedList impliments list interface
		// 2. can contain duplicate values/element
		// 3. maintains insertion order
		// 4. ArrayList contains null values
		// non synchrinised
		// If any element is removed/added from the array, all the bits are not shifted
		// in memory.
		// LinkedList is better for manipulating data.
		// 5. it allows random access to fetch the element bcz it stores the values on
		// the bases of index

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("selenium");
		ll.add("Qtp");
		ll.add("RPA");
		ll.add("RFT");
		ll.add(null);
		ll.add(null);
		ll.add("RPA");

		System.out.println("content of LinkedList" + ll);

		System.out.println("*** using listIterator forward direction ***");

		ListIterator<String> forwordli = ll.listIterator();
		while (forwordli.hasNext()) {
			System.out.println(forwordli.next());
		}
		
		System.out.println("*** using listIterator backward direction ***");
		ListIterator<String> backli = ll.listIterator();
		while (backli.hasPrevious()) {
			System.out.println(backli.previous());
		}

		ll.addFirst("Automation");
		ll.addLast("manual test");

		System.out.println(ll);

		// get
		System.out.println(ll.get(0));

		// set
		ll.set(0, "ram");
		System.out.println(ll.get(0));

		// Remove First and Last Element

		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.remove(3);

		System.out.println("content of LinkedLost " + ll);

		// how to print all values of LinkedList

		System.out.println("*** using for loop***");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));

		}
		// using advanced for loop
		System.out.println("*** using advanced for loop***");

		for (String str : ll) {
			System.out.println(str);
		}

		// using iterator
		System.out.println("*** using iterator***");

		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// using while loop
		System.out.println("*** using while loop***");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
