package NewPackage.prog;

import java.util.Scanner;

public class AABB 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)=='a')
			{
				a++;
			}
			else {
				b++;
			}
		}
		boolean flag = true;
		
		if (a==b)
		{
			flag = false;
		}
		
		if (flag) {
			System.out.println("no");
		}
		
		while(!flag)
		{
			
			int count = 0;
		
			for (int i = 0; i < s.length()-1; i++)
			{
				if (s.charAt(i)!=s.charAt(i+1))
				{
					count++;
				}		
			}
			if (count==1)
				{
					System.out.println("YES");
					flag = true;
				} else {
					System.out.println("NO");
					flag = true;
				}
		}
	}


}
