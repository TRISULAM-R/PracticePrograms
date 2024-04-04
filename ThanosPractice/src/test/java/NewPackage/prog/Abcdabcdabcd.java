package NewPackage.prog;

import java.util.LinkedHashSet;

public class Abcdabcdabcd
{
	public static void main(String[] args) {
		
		String s = "abcdabcdabcdabcd";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		for (char stri : set) 
		{
			for (int i = 0; i < s.length(); i++) 
			{
				if (stri==s.charAt(i))
				{
					System.out.print(stri);
				}
			}
		}
		
		System.out.println("");
		System.out.println("============================================");
		
		for (char i = 'a'; i <='z' ; i++)
		{
			for (int j = 0; j < s.length(); j++) 
			{
				if (i==s.charAt(j))
				{
					System.out.print(i);
				}
			}
		}
		
	}
}
