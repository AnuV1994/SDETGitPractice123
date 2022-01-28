package SDETPROJECT26.SDETTY;
//Tester T-1 e--2 s--3 r--6(position)

import java.util.LinkedHashSet;

public class Tester {
	public static void main(String[] args) {
				String str="Tester";
				String s=str.toLowerCase();
				LinkedHashSet<Character>	set = new LinkedHashSet<Character>();
				for(int i=0; i<s.length(); i++)
				{
					set.add(s.charAt(i));
					
				}
				System.out.println(set);
				
				
				for(Character ch :set) {
					int count=0;		
					for(int i=0; i<s.length();i++ ) {
						if (ch==s.charAt(i)) {
							//count++;
							System.out.println(ch+""+(i+1));
							break;
						}
						
					}//System.out.println(ch+""+count);
				}
			}
		}

	