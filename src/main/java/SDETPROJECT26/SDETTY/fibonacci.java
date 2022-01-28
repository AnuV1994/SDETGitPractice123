package SDETPROJECT26.SDETTY;

public class fibonacci {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		System.out.println("1st two numbers are "+a+"  "+b);
		int c;
		for(int i=0; i<=5;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
