package SDETPROJECT26.SDETTY;
//rev each word of given strng
public class reverseEachCharInString {
	public static void main(String[] args) {
String c="Wellcome to Java";
String rev="";
String[] str=c.split(" ");
for(int i=str.length-1; i>=0;i++) {
	rev=rev+str[i]+" ";
}
System.out.println(rev);
}

}
