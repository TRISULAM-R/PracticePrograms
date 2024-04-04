package NewPackage.prog;

public class Arc123 
{
	public static void main(String[] args) 
	{
		
		
		
		String s= "Arc123";
		
		int max_num = s.charAt(s.length()-1)-48;
		
		int iterations = 5;
		
		for (int i = max_num+1; i < max_num+1+iterations ; i++) 
		{
			s=s+i;
			System.out.println(s);
		}
	}
}
