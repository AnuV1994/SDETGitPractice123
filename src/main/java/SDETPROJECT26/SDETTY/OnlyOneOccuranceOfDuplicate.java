package SDETPROJECT26.SDETTY;

import java.util.LinkedHashSet;

public class OnlyOneOccuranceOfDuplicate {
	
		public static void main(String[] args) {
			int a[]= {1,2,3,4,5,6,5};
			LinkedHashSet<Character>	set = new LinkedHashSet<Character>();
			for(int i=0; i<a.length(); i++)
			{
				set.add(a[i]);
				
			}
			System.out.println(set);
			
			
			for(Integer  n :set) {
				int count=0;		
				for(int i=0; i<a.length();i++ ) {
					if (n==a[i]) {
						count++;
					}
					
				}
				if(count>1) {
				System.out.println(n+""+count);
			}
		}
	}

}
