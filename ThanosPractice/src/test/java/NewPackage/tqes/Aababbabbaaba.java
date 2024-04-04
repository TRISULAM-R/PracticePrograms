package NewPackage.tqes;

public class Aababbabbaaba 
{
	 public static void main(String[] args) {
		
		 String s = "aababbabbaab";
		 
		 for (int i = 0; i < s.length(); i++) {
			
			try {
				 if (s.substring(i, i+1).equals(s.substring(i+1, i+2))) 
					{
						 System.out.print(s.substring(i,i+2));
						 i=i+1;
					}else {
						System.out.print(s.charAt(i));
						System.out.print(s.charAt(i));
					}
				
			} catch (Exception e) {
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i));
			}
		}
	}

}
