package NewPackage.string;

public class Sorting_String_in_alphabetically 
{
	public static void main(String[] args) {
		String s = "abcd,abcd,abcd";
		String s1 = s.replace(",", "");
		
		for (char ch = 'a'; ch <='z' ; ch++)
		{
			boolean flag = false;
			for (int i = 0; i < s1.length(); i++) 
			{
				if (s1.charAt(i)==ch)
				{
					System.out.print(ch);
					if (i==s1.length()-1)
					{
						flag=false;
					}else {
						flag=true;
					}
				}
			}
			if (flag) 
			{
				System.out.print(",");
			}
		}
	}
}
