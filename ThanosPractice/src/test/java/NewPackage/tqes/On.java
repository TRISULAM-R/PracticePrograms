package NewPackage.tqes;

import java.util.LinkedHashSet;

public class On
{
	public static void main(String[] args) {
		String s = "aababbaab";

		LinkedHashSet<String> set = new LinkedHashSet<String>();

		for(int i = 0 ; i<s.length()-1;i++)
		{
			String ss ="";
			if(s.charAt(i)==s.charAt(i+1))
			{
				 ss = ss + s.charAt(i);
				 ss = ss + s.charAt(i+1);
				set.add(ss);
			}
		}
		
		for (String string : set)
		{
			int count = 0;
			for (int i = 0; i < s.length()-2; i++)
			 {
				if(s.substring(i,i+2).equals(string))
				{
					count++;
				}
			}
			if (count==1) 
			{
				System.out.println(string);
			}
		}
	}

	
}
