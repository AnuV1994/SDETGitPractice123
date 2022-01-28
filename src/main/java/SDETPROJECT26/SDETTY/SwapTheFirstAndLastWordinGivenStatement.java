package SDETPROJECT26.SDETTY;

public class SwapTheFirstAndLastWordinGivenStatement {
		public static void main(String[] args) {
	String s="Welcome to class Java";
	String[] str = s.split(" ");
	
	String temp=str[0];
	str[0]=str[str.length-1];
	str[str.length-1]=temp;
	
	
	for(int i=0; i<str.length;i++) {
		
	
	System.out.print(str[i]+" ");
	}

	}
}


