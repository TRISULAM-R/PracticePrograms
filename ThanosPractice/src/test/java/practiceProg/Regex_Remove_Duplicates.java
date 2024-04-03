package practiceProg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Remove_Duplicates {

	public static String removeDuplicates(String input)
	{
		String regex ="\\b(\\w+)(?:\\W+\\1\\b)+";
		 Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		 
	        // Pattern class contains matcher() method
	        // to find matching between given sentence
	        // and regular expression.
	        Matcher m = p.matcher(input);
	 
	        // Check for subsequences of input
	        // that match the compiled pattern
	        while (m.find()) {
	            input = input.replaceAll( m.group(), m.group(1));
	        }
	        return input;
	}
	public static void main(String[] args) {
		
		String str= "Good bye bye world world";
		
		System.out.println(removeDuplicates(str));
	}
}
