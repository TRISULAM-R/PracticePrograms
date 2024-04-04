package NewPackage.tqes;

public class SortarrayinAssendingorder 
{
	public static void main(String[] args) {
		
		String[] s = {"abcz","aaa","b","abcy"};
		
		int max_length = 0;
		for (int i = 0; i < s.length; i++) 
		{
			if (max_length<s[i].length()) 
			{
				max_length=s[i].length();
			}
		}
		for (int i = 0; i < max_length; i++) 
		{
				for (int j = 0; j < s.length; j++) {
					
					for (int j2 = j+1; j2 < s.length; j2++)
					{
						if (i>0)
						{
							try {
								if ((s[j].charAt(i-1))==(s[j2].charAt(i-1))) 
								{
									if ((s[j].charAt(i))>(s[j2].charAt(i))) {
									String Temp = s[j];
									s[j]=s[j2];
									s[j2]=Temp;
									}
								}
							} catch (Exception e) {
								
							}
						}  else if ((s[j].charAt(i))>(s[j2].charAt(i)))
						{
							String Temp = s[j];
							s[j]=s[j2];
							s[j2]=Temp;
						}
					}
				}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}
}
