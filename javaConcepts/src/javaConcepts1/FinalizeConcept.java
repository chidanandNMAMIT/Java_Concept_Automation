package javaConcepts1;

public class FinalizeConcept {
	
	
	public void finalize() {
		
		System.out.println("this is finalized Concept");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1=new FinalizeConcept();// used for clean up processer, it is a Method
		FinalizeConcept f2=new FinalizeConcept();
		
		f1=null;
		f2=null;
		
		System.gc();
	}

}
