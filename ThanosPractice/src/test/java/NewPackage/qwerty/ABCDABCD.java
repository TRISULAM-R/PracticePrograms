package NewPackage.qwerty;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ABCDABCD
{
	public static void main(String[] args) {
	
		String s = "abababababab";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		ArrayList<Character> alist = new ArrayList<Character>(set);

		
		int count = 1;
		for (int i = 0; i < s.length(); i++) 
		{
			if(count%2!=0)
			{
				System.out.print(alist.get(0));
				System.out.print(alist.get(0));
				i=i+1;
			}else {
				System.out.print(alist.get(1));
				System.out.print(alist.get(1));
				i=i+1;
			}
			count++;
		}
		}
}

