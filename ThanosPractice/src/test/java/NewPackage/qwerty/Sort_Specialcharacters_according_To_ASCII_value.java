package NewPackage.qwerty;

import java.util.LinkedList;

public class Sort_Specialcharacters_according_To_ASCII_value
{
	public static void main(String[] args) {
		
		String s = "@#$%%/^&*^&*()_";
		
		LinkedList<Character> list = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			list.add(s.charAt(i));
		}
	
		for (int i = 33; i < 48; i++) 
		{
			for (int j = 0; j < s.length(); j++)
			{
				if(i==s.charAt(j))
				{
					System.out.print(s.charAt(j));
				}
			}
		}
	}
}
