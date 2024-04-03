package practiceProg;

import org.testng.annotations.Test;

public class PatternMatchingRegex {

	public static void main(String[] args) {
		
		
		String s="01:01:54 PM";
		
		System.out.println( s.matches("(0[1-9]|1[0-2]):([0-5][0-9]):([0-5][0-9]) (AM|PM)"));
	}
	
	@Test
	public void testMethod()
	{
		String s="1.0.0.127";
		
		System.out.println( s.matches("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$"));
	}
	
	@Test
	public void testMethod2()
	{
		String s="Inbox(0)";
		
		System.out.println( s.matches("Inbox|Inbox\\([1-9]+\\)"));
	}
	
	@Test
	public void testMethod3()
	{
		String s="tyr_ytgrtyuir@gmail.com";
		
		System.out.println( s.matches("[A-Za-z]([A-Za-z0-9_\\.\\$]){3,13}(@gmail.com)$"));
	}
}
