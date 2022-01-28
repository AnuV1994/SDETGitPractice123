package SDETPROJECT26.SDETTY;

public class ReverseString {
	public static void main(String[] args) {
		 String s = "hello";
		/** System.out.println("given string word is "+s);
		 for(int i= s.length()-1 ; i>=0 ; i--) {
			 System.out.print(s.charAt(i));
		 } **/
		 
		 String reverse = new StringBuffer(s).reverse().toString();
		 System.out.println(reverse);
		/**  System.out.println(reverse);
		 System.out.println(reverse);
		 System.out.println(reverse);
		 System.out.println(reverse);  **/
		 
		 String newstring = new StringBuffer(reverse).append("Java").toString();
		 
		 System.out.println(newstring);
		 System.out.println(newstring);
		 
		 StringBuffer additionalstring = new StringBuffer(newstring);
		 additionalstring.insert(1,"OOOO");
		 System.out.println(additionalstring);
		 
		 
	}
}
