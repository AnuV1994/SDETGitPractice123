package SDETPROJECT26.SDETTY;
// sum of every consecutive numbers

public class sumOfEveryFirstTwoNumberInString {
	public static void main(String[] args) {
	String s= "15a10b10";
	int tsum=0;
	int sum=0;
	for (int i=0; i<s.length();i++) {
	if(s.charAt(i)>='0' && s.charAt(i)<='9') {
		int n = s.charAt(i)-48;
		sum = sum*10+n;
	}
		else{
		 tsum = tsum+sum;  //15 10  10
		sum=0;
		}
		
	} tsum=tsum+sum;
	System.out.println(tsum); //15+10+10 =35
}
}
