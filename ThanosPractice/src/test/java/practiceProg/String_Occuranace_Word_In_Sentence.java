package practiceProg;

import java.util.*;

public class String_Occuranace_Word_In_Sentence {

	public static void main(String[] args) {

		String s = "I love Java yes I do";

		Set<String> set = new LinkedHashSet();
		String[] str= s.split(" ");

		for (String string : str) {
			set.add(string);
		}
		for (String string : set) {
			int count =0;
			for (int i = 0; i < str.length; i++) {
				if(string.equalsIgnoreCase(str[i]))
				{
					count++;
				}
			}
			System.out.println(string +" is present "+count+" times");
		}
	}
}
