package SDETPROJECT26.SDETTY;

public class SwapNumberWOThirdVariable {

	public static void main(String[] args) {
		 int a = 20;
		 int b=  50;
		 
		 
		 System.out.println("first number in a is "+a);
		 System.out.println("first number in b is "+b);
		 a=a+b;//70
		 b=a-b;//20
		 a=a-b;//50
		 System.out.println(" number in a after swap  is "+a);
		 System.out.println(" number in b after swap is "+b);
	}
}
