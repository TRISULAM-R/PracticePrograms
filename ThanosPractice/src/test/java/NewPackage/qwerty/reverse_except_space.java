package NewPackage.qwerty;

public class reverse_except_space 
{
	public static void main(String[] args) 
	{
		String s = "pon mlkjih gfedcba";
		
		/** Method 1 **/
		
		String rev = "";
		String fi = "";
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)!=' ') 
			{
				rev=s.charAt(i)+rev;
			}
		}
		
	
		for (int i = 0 ,k = 0 ; i < s.length(); i++)
		{
			if (s.charAt(i)==' ') 
			{
				fi=fi+" ";
			}
			else  
			{
				fi=fi+rev.charAt(k);
				k++;
			}
		}
		System.out.println(fi);
		
		
		
		System.out.println("==============================================");
		
		/** Method 2 **/
		
		String rev1 = "";
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)!=' ') 
			{
				rev1=s.charAt(i)+rev1;
			}
		}
		
		int k = 1;
		for (int i = 0; i < rev1.length(); i++)
		{
			System.out.print(rev1.charAt(i));
			
			if (i==rev1.length()-1) {
				
			}else if(s.charAt(i+k)==' ') 
			{
				System.out.print(" ");
				k++;
			}
		}		
		
		System.out.println("");
		System.out.println("==============================================");

		
		/** Method 3 **/
		
		String rev2 = "";
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)!=' ') 
			{
				rev2=s.charAt(i)+rev2;
			}
		}
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)==' ')
			{
				rev2 = rev2.substring(0,i)+" "+ rev2.substring(i ,rev2.length());
			}
		}
		
		System.out.println(rev2);
	}
}
