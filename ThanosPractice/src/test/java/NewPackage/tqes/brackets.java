package NewPackage.tqes;

import java.util.LinkedList;

public class brackets 
{
	public static void main(String[] args) {
		
		String s ="{20+[10*[5]*10+(10+[5-15]+10)*(5-15)]}";
		LinkedList<Character> list = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)=='{'||s.charAt(i)=='}'||s.charAt(i)=='['||
				s.charAt(i)==']'||s.charAt(i)=='('||s.charAt(i)==')') 
			{
				list.add(s.charAt(i));
			}
		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++)
		{
 			if (list.get(i)=='{' || list.get(i)=='[' || list.get(i)=='(') 
			{
			}else if (list.get(i)=='}')
			{
				if (list.get(i-1)=='{')
				{
					list.remove(i);
					list.remove(i-1);
					System.out.println(list);

					
					i=-1;
				}
			}else if (list.get(i)==')')
			{
				if (list.get(i-1)=='(')
				{
					list.remove(i);
					list.remove(i-1);
					System.out.println(list);

					i=-1;
				}
			}else if (list.get(i)==']')
			{
				if (list.get(i-1)=='[')
				{
					list.remove(i);
					list.remove(i-1);
					System.out.println(list);

					i=-1;
				}
			}
		}
		if (list.size()==0) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");

		}
	}
}
