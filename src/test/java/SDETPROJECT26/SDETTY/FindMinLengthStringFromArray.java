package SDETPROJECT26.SDETTY;

public class FindMinLengthStringFromArray {
		public static void main(String[] args) {
			String str[] = {"abc","hi","mango","j","l","tyssr"};
			String max= str[0];
			for(int i=1;i<str.length; i++) {
				if(max.length()>str[i].length()) {
					max=str[i];
					//System.out.println("max length string is"+max);
				}
			}
				for( int j=0;j<str.length; j++) 
				{
					 if(max.length()==str[j].length()) {
						System.out.println(str[j]);
					}
						
					}
			}
	}


