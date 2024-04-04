package NewPackage.string;

import java.util.LinkedHashSet;

public class Print_order_of_occurance_of_Charsequence
{
	public static void main(String[] args) 
	{
		String s = "aabbccca";
		
		/** Method 1 **/
		
		int j=0;
		boolean flag = true;
		while (flag) {
		for (char l = 'a'; l <= 'z' ; l++) {
			int count =0;
			for (int i = j; i < s.length(); i++) {
				if (s.charAt(i)==l) {
					count++;
					if (i==s.length()-1){
						flag=false;
					}
				}else {
					j=i;
					break;
				}
			}
			if (count>0) {
				System.out.print(l+""+count);
			}
		}
		}
		System.out.println("");
		System.out.println("=============================================================");
		
		/** Method 2 **/
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++){
			set.add(s.charAt(i));
		}	
		int k = 0;
		boolean flag1 = true;
		while(flag1){
		for (Character chara : set){
			int count = 0;
			for (int i = k; i < s.length(); i++){
				if (chara==s.charAt(i)) {
					count++;
					if (i==s.length()-1){
						flag1 = false;
					}
				}else {
					k=i;
					break;
				}
			}
			if (count>0){
				System.out.print(chara+""+count);
			}
		}
		}
	}
}