package listConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		// HashMap is a class  implements Map interface
		//extends AbstractMap
		//it contains only unique elements
		// it stores the values on the basis of (key - value) pair
		// it may have one null key and multiple null values
		// it maintains no order
		//HashMap is non synchronised----> not thread safe
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "selemiun");
		hm.put(2, "QTP");
		hm.put(3, "Winnium");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(4));
		
		for(Entry m:hm.entrySet()) {
		
			System.out.println(m.getKey()+ " "+m.getValue());
		}
		
		System.out.println("Before Removal" +hm);
		hm.remove(4);
		System.out.println("After Removal" +hm);
		
		
		HashMap<Integer, Employe> emp=new HashMap<Integer, Employe>();
		
		Employe e1=new Employe("tom", "admin", 25);
		Employe e2=new Employe( "peter", "QA",26);
		Employe e3=new Employe("naveen", "Dev",28);
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//Traverse the HashMap:
		
		for(Entry<Integer, Employe> em:emp.entrySet()) {
			
			int k=em.getKey();
			Employe e=em.getValue();
			
			System.out.println("employe" + k + " info ");
			System.out.println(e.name+" "+e.dept+" "+e.age);
			
		}
	}

}
