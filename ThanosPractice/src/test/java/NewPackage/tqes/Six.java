package NewPackage.tqes;

public class Six 
{
	public static void main(String[] args) {
		
		String s = "one wert hh qwertyu a";
		
		String[] ss = s.split(" ");
		String maxele = ss[0];
		String minele = ss[0];
		
		for (int i = 0; i < ss.length; i++) 
		{
			if (ss[i].length()>maxele.length())
			{
				maxele = ss[i];
			}
			if (ss[i].length()<minele.length()) 
			{
				minele = ss[i];
			}
		}
		
		System.out.println("maxele " +maxele);
		System.out.println("minele "+minele);
		
	}
}
