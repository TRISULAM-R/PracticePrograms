package NewPackage.prog;

public class REverse_the_max_element
{
	public static void main(String[] args) {
		
		String[] s = {"abcd","asdfghj","ertyuiohhjdj"};
		
		String max = s[0];
		
		for (int i = 0; i < s.length; i++) 
		{
			if (max.length()<s[i].length())
			{
				max=s[i];
			}
		}
		System.out.println(max);
		
		String rev = "";
		for (int i = 0; i < max.length(); i++)
		{
			rev=max.charAt(i)+rev;
		}
		
		System.out.println(rev);
	}
}
