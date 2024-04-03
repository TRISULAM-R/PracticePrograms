package practiceProg;

public class ReverseWords {

	public static void main(String[] args) {

		String st="I am Selenium";	// m ui neleSmai 
		String str = st.toLowerCase();
		
		char[] ch = str.toCharArray();
		 int start = 0;
		 int end = ch.length-1;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[start]>='a' && ch[start]<='z') {
				if(ch[end]>='a' && ch[end]<='z') {
					if(start<end) {
						char temp=ch[end];
						ch[end]=ch[start];
						ch[start]=temp;
						start++;
						end--;
					}
				}else {
					end--;
				}
			}else {
				start++;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
// 2 way===> HardCoding
//		
//		String b=str.replace(" ", "");
//		
//		int count=1;
//		for (int i = b.length()-1; i >=0; i--) {
//			if(count==1) {
//				System.out.print(b.charAt(i)+" ");
//			}else if(count==3) {
//				System.out.print(b.charAt(i)+" ");
//			}else {
//				System.out.print(b.charAt(i));
//			}
//			count++;
//		}
	}
}
