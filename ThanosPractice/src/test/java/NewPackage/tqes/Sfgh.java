package NewPackage.tqes;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Sfgh 
{
	public static void main(String[] args) {
		
		String s = "aababbaab";
		

		ArrayList<String> set = new ArrayList<String>();

		for(int i = 0 ; i<s.length()-1;i++)
		{
			String ss ="";
			if(s.charAt(i)==s.charAt(i+1))
			{
				
				ss =ss +s.charAt(i);
				ss =ss +s.charAt(i+1);
				set.add(ss);
				
			}

		}
		LinkedHashSet<String> lset = new LinkedHashSet<String>(set);
		//System.out.println(lset);

		//System.out.println(set);
		
		for(String sss : lset)
		{
			int count = 0;
			for(String s1 :set)
			{
				if(sss.equals(s1))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(sss);
			}
		}
	}
}
