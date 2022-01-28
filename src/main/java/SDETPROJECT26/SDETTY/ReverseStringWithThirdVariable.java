package SDETPROJECT26.SDETTY;

public class ReverseStringWithThirdVariable {

	public static void main(String[] args) {
		 String s = "hello";
		 String rev="";
		 System.out.println("given string word is "+s);
		 for(int i= s.length()-1 ; i>=0 ; i--) {
			 rev=rev+s.charAt(i);
		 }System.out.print(rev);
	}

}
