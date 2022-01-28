package SDETPROJECT26.SDETTY;

public class substring {
	public static void main(String[] args) {
		String s1="java";
		String s2="selenium";
		s1= s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));      //javaselenium-----12-8-------=java
		
		s1=s1.substring(s2.length());     //javaselenium-(4)------selenium
		System.out.println(s1);
		System.out.println(s2);
}
}
