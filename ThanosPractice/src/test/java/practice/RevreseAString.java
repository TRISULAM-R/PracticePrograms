package practice;

public class RevreseAString {

	public static void main(String[] args) {

		
		String s= "i love java selenium";
		
		String[] str= s.split(" ");
		
		for(int i =str.length-1; i>=0; i--)
		{
			for(int j=str[i].length()-1; j>=0; j--)
			
			//char [] ch =str[i].toCharArray();
//			for(int j=ch.length-1; j>=0; j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
		
	}
}
