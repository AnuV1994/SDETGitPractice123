package SDETPROJECT26.SDETTY;

public class RevStringWOLengthMethod {
	
		public static void main(String[] args) {
			 String s = "hello";
			 String rev="";
			 System.out.println("given string word is "+s);
			 char [] ch=s.toCharArray();
			 int count=0;
			 for(char c :ch) {
				 count++;
			 }
			 for(int i=count-1 ; i>=0 ; i--) {
				 rev=rev+s.charAt(i);
			 }System.out.print(rev);
		
	}


}
