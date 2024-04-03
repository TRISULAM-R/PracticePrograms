package practiceProg;

import org.openqa.selenium.devtools.v113.css.model.StyleSheetOrigin;
import org.testng.annotations.Test;

public class String_Prashanth_Questions {
	
	@Test
	public void getOutput() {
		
		String s = "123";  //o/p: 6
		char[] ch = s.toCharArray();
		
		int temp = 0;
		for(char c : ch)
		{
			temp =temp + ((int)c - ((int)'0'));
		}
		System.out.println(temp);
	}
	
	
	
	@Test
	public void getOutput2()
	{
		int num = 345; // o/p: 12
		int temp=0;
		while(num>0)
		{
			temp+=(num%10);
			num=num/10;
		}
		System.out.println(temp);
	}
	
	@Test
	public void getOutput3()
	{
		String[] s={"trisulam","shivu","prajwal"};
		
		for(int i=0; i<s.length;i++)
		{
			int count =0;
			for(int j=0; j<s[i].length(); j++)
			{
				if(s[i].charAt(j)=='a' ||s[i].charAt(j)=='e' ||s[i].charAt(j)=='i' ||s[i].charAt(j)=='o' ||s[i].charAt(j)=='u')
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
	@Test
	public void getOutPut4()
	{
		String s="i am tamilnadu";
		
		String[] str = s.split(" ");
		for(int i=0; i<str.length; i++)
		{
			for(int j=str[i].length()-1; j>=0; j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		System.out.println("=======================================");
		
		for(int i=str.length - 1; i>=0; i--)
		{
			for(int j=str[i].length()-1 ; j>=0; j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}
}
