package NewPackage.tqes;

public class Hello_world
{
	public static void main(String[] args) {
		
		String s = "Hello   world";
		String[] ss = s.split(" ");
		
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].equals("")) {
				System.out.print(" ");
			}else {
				
				if (i!=ss.length-1){
					for (int j = ss[i].length()-1; j >=0 ; j--) {
						System.out.print(ss[i].charAt(j));
					}
					System.out.print(" ");
				}else {
					for (int j = ss[i].length()-1; j >=0 ; j--) {
						System.out.print(ss[i].charAt(j));
					}
				}
			}
		}
		System.out.println("");
		System.out.println("==============================================");
		
		
		String s1 = "";
		for (int i = 0; i < ss.length; i++) 
		{
			String s2 = ss[i];
			String s3="";
			for (int j = 0; j <s2.length(); j++) 
			{
				s3=s2.charAt(j)+s3;
			}
			s1=s1+s3;
		}
		for (int i = 0 ,k = 0; i < s.length(); i++)
		{
			if (s.charAt(i)==' ')
			{
				System.out.print(" ");
			}else {
				System.out.print(s1.charAt(k));
				k++;
			}
		}
	}
}
