package practiceProg;

public class RevereseAString {

	public static void main(String[] args) {

		String s= "Trisulam";
	
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
