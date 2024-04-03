package practiceProg;

import java.util.Arrays;

public class Q6_Check_Characters_Anagram {

	public static void main(String[] args) {
	//You are given 2 strings as input. You have to check whether they are anagrams or not.
		String s1="silent";
		String s2="listen";
		boolean flag = checkAnagram(s1, s2);
		if(flag)
		{
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}

	public static boolean checkAnagram(String s1, String s2)
	{
		boolean flag = true;
		if(s1.length() == s2.length())
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
		
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		
			for(int i=0; i<ch1.length;i++)
			{
				if(ch1[i] != ch2[i])
				{
					flag = false;
				}
			}
		}
		else {
			flag = false;
		}
		return flag;
	}
}
