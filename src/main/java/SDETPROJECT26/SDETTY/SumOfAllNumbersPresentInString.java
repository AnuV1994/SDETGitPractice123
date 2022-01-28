package SDETPROJECT26.SDETTY;

public class SumOfAllNumbersPresentInString {
	public static void main(String[] args) {
	String s = "uhjed56768qo3j**7";
	int sum=0;
	for (int i=0; i<s.length();i++) {
		if(s.charAt(i)>=48 && s.charAt(i)<=57) {
			int n= s.charAt(i)-48;
			 sum=sum+n;
			
		}
	} System.out.println(sum);
	}
}
	
	
	