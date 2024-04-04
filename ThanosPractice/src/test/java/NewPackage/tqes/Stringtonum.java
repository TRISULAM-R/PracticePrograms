package NewPackage.tqes;

public class Stringtonum 
{
	public static void main(String[] args) {
		
		

		String s = "123";
		int num = 0;
		for(int i = 0; i<s.length();i++)
		{
			num = num*10+(s.charAt(i)-48);
		}

		System.out.println(num);
	}
}
