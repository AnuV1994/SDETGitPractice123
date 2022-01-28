package SDETPROJECT26.SDETTY;
//string "have a good day" to "Have A Good Day" with toUpper after converting the char to string
//97-32 gets uppercase    char=    (char)(s.charAt(i))-32// String s=""+s.charAt(i);
														  // s1.toUpper(s)
public class ChangeFirstLetterOfEveryLetterIntoCaps {
	public static void main(String[] args) {
	
	String s ="stone";
	for(int i =0; i<s.length(); i++){
		if(i==0){
	
		String s1= ""+ s.charAt(i);
		System.out.print(s1.toUpperCase());
		}else {
			System.out.print(s.charAt(i));
}
	}
}
}
