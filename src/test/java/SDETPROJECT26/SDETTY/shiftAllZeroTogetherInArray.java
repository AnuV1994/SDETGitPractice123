package SDETPROJECT26.SDETTY;

public class shiftAllZeroTogetherInArray {
	public static void main(String[] args) {
		int a[] = {1,0,0,2,0,5,4,0};
		int n=a.length-1;
		int m=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length; i++) {
			if(a[i]==0) {
				
					b[n]=a[i];
					n--;
				}
			else {
				b[m]=a[i];
				m++;
			}
			}
		for(int j=0;j<b.length; j++) {
		System.out.println(b[j]+"");
	}
}}