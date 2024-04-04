package NewPackage.prog;

import java.util.LinkedHashSet;

public class Only_Print_the_PASSWORD 
{
	public static void main(String[] args) {
		String s1 = "5hhj65 is my password";
		String s2 = "my name is vijay";
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add(s1);
		set.add(s2);
		for (String str : set) {
			String[] ss = str.split(" ");
			
			for (int i = 0; i < ss.length; i++) {	
				boolean flag = false;
				String s = ss[i];
				for (int j = 0; j < s.length(); j++) {
					for (char ch = '0'; ch <='9'; ch++) {
			
					if (ch==s.charAt(j)) {
						flag =true;
						break;
					}
					}
				}
				if (flag) {
					System.out.println(s);
				}
			}
			System.out.println();
		}
	}
}
