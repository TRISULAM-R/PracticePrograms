package practice;

public class String_reverseFirstHalf {

	public static void main(String[] args) {
		
		String s="trisulam";
		char[] ch =s.toCharArray();
		for (int i = 0; i < ch.length/2; i++) {
			System.out.println(ch[i]);
		}
		for(int i=ch.length-1; i>=ch.length/2; i--)
		{
			System.out.println(ch[i]);
		}
	}

}
