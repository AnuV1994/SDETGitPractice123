package SDETPROJECT26.SDETTY;

public class Paliendrome {
	public static void main(String[] args) {
		int n = 1741;
		int temp = n;
		int rev=0;
		while(n>0) {
		int digit= n%10;
		rev = rev*10+digit;
		n=n/10;
		}
		if(rev==temp) {
			System.out.println("paliendrome");
		}
		else {System.out.println(n+" not paliendrome");}
	}
}
