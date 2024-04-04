package NewPackage.string;

public class Sort_the_String_ALPHABETICALLY 
{
	public static void main(String[] args) 
	{
		String s ="abcdabcdabcd";
		for (char ch = 'a'; ch <='z'; ch++)
		{
			for (int i = 0; i < s.length(); i++)
			{
				if (ch==s.charAt(i))
				{
					System.out.print(ch);
				}
			}
		}
	}
}
