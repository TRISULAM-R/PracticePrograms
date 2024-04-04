package NewPackage.tqes;

public class Five
{
	public static void main(String[] args) {
		
		String s = "qwe   wer gu  fgh";
		
		String[] ss = s.split(" ");
		
		for (String string : ss)
		{
			System.out.print(string);
		}
	}
}
