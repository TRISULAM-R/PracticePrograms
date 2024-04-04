package NewPackage.qwerty;

public class sumofdigitsuntillsingledigit 
{
 public static void main(String[] args) {
	
	 int num = 34562;
	 
	 while(num>9)
	 {
		 int sum=0;
		 
		 while(num>0)
		 {
			 int rem = num%2;
			 sum = sum+rem;
			 num = num/10;
		 }
		 num=sum;
	 }
	 System.out.println(num);
}
}
