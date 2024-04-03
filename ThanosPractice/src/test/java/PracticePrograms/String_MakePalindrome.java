package PracticePrograms;

import java.util.Iterator;

public class String_MakePalindrome {

	public static void main(String[] args) {

		int n=4;
		String[] arr = {"djfh", "gadt", "tdag", "hfjd"};
		String s = "";
		for(int i=0; i<arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++) {
			}
			s=s+arr[i];
		}
		boolean flag = true;
		for(int j =0, m =s.length()-1; j<s.length()/2;j++, m--)
		{
			if(s.charAt(j)!=s.charAt(m))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(s+" Is Palindrome");
		} else {
			System.out.println(s+" Not Palindrome");
		}
		
	}
}
