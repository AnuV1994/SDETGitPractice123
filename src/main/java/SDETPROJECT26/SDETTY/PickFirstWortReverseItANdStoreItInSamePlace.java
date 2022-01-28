package SDETPROJECT26.SDETTY;
//NOTE:Reverse every word
public class PickFirstWortReverseItANdStoreItInSamePlace {
	public static void main(String[] args) {
		String s="Welcome to class Java";
		
		String[] str = s.split(" ");
		
		
		 for(int i= 0; i<=str.length  ; i++) 
		 {
			 String s1=" "+str[i].charAt(0);
			 System.out.print(s1.toUpperCase()+str[i].substring(1)+" ");
			 }
	
}
}
