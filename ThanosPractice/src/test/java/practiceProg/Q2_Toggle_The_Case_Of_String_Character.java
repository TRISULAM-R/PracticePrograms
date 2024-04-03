package practiceProg;

public class Q2_Toggle_The_Case_Of_String_Character {

	public static void main(String[] args) {

		String s="ApPlLe";
		char[] ch =converCharacter(s);
		for(int i=0; i<ch.length; i++)
		{			
			System.out.println(ch[i]);
		}
	}

	public static char[] converCharacter(String s)
	{
		char[] ch = s.toCharArray();
		
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i] = (char) (ch[i] +('a'- 'A'));
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i] = (char)(ch[i] + ('A' - 'a'));
			}
		}
		return ch;
	}
	
}
