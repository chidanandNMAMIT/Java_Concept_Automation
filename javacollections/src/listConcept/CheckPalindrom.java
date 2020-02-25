package listConcept;

public class CheckPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="malayalam";
		int len = text.length();
		int flag = 0;
		for(int index = 0;index < len/2; index++) {
			if( text.charAt(index) == text.charAt(len-index-1) ) {
				flag = 1;
			}else {
				flag = 0;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("palindrome");
		}else {
			System.out.println(" Not palindrome");
		}
	}

}
