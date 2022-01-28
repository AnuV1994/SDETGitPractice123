package SDETPROJECT26.SDETTY;

import java.util.LinkedHashSet;

public class PrintUniqueWords {

				public static void main(String[] args) {
					String s="Welcome to to tyss";
					
					String[] str= s.split(" ");
					
					LinkedHashSet<String>	set = new LinkedHashSet<String>();
					for(int i=0; i<str.length ; i++)
					{
						set.add(str[i]);
						
					}
					System.out.println(set);
					
					
					for(String string :set) {
						int count=0;		
						for(int i=0; i<str.length;i++ ) {
							if (string.equals(str[i])) {
								count++;
							}
							
						}
						if(count==1) {
							System.out.print(string+" ");
					}
				}
			}
	}




