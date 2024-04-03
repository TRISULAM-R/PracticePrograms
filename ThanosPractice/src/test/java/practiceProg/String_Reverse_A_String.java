package practiceProg;

public class String_Reverse_A_String {

	public static void main(String[] args) {

		
		String s="testyantra";  //o/p: artnaytset
		String temp ="";		
		char[] str = s.toCharArray();
		for(int i=str.length-1; i>=0;i--)
		{
			temp=temp+str[i];
		}
		System.out.println(temp);
	}

	
	
}
