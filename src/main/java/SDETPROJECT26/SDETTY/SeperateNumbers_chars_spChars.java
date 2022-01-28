package SDETPROJECT26.SDETTY;

public class SeperateNumbers_chars_spChars {
	public static void main(String[] args) {
	String s = "uhjed56768qo3j**7";
	String al="";
	String num  ="";
	String sp ="";
	
for (int i=0; i<s.length();i++)
{
	if(s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>='A' && s.charAt(i)<='Z' ){
		 al= al+s.charAt(i);
	}
	else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
		num= num+s.charAt(i);
}
	else {
		sp= sp+s.charAt(i);
}
	
}
System.out.println("the numbers are "+ num);
System.out.println("the Alphabets are   "+ al);
System.out.println("the Sp.Chars are  "+ sp);
}
}
	
	
	
	
	
	
	
	
/**
	public static void main(String[] args) {
			String s="naycf7&4*ana";
			if(ascii bwn 97 to 122 ;lowercase alpha)
				65 to 90 caps alpha
				
				elseif( 48 to 57 number 0 to9)
				
				else()
	}}

		**/