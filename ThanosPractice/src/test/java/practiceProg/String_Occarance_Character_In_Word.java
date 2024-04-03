package practiceProg;

import java.util.*;
public class String_Occarance_Character_In_Word {
	

	public static void main(String[] args) {
		String s = "mosambijuice";
		
		Set<Character> set = new HashSet();
		char[] str = s.toLowerCase().toCharArray();
		
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		
		for(char c : set)
		{
			int count=0;
			for(int j=0; j<str.length; j++)
			{
				if(c==str[j])
				{
					count++;
				}
			}
			System.out.println(c +" => "+count);
		}
	}
}

