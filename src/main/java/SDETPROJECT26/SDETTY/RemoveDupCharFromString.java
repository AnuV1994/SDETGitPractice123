package SDETPROJECT26.SDETTY;
	import java.util.LinkedHashSet;

	public class RemoveDupCharFromString {
		public static void main(String[] args) {
			String s="india";
			
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
						count++;
					}
					
				}
				if(count==1) {
				System.out.print(ch);
			}
		}
	}

}



