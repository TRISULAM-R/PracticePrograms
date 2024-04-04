package NewPackage.string;

public class Palindrome 
{
	public static void main(String[] args) {
		int num = 2002;
		int numc = num;
		int rev1 = 0;
		int countf = 0;
		boolean flag = true;
		while(flag)
		{
			int num1 = numc;
			rev1 = 0;
			while(num1>0)
			{
				countf++;
				int rem = num1%10;
				rev1 = (rev1*10)+rem;
				num1=num1/10;
			}
			if (rev1==numc && rev1!=num)
			{
				System.out.println("Next palindrome number of "+num+" = "+rev1);
				flag=false;
			}/////////////////////////////////""xkcsncj
			numc = numc +1;
		}
		System.out.println("=======================================================");
		int numbc = num;
		int countb = 0;
		int rev2 = 0;
		boolean flag1 = true;
		while(flag1) 
		{
			int num1 = numbc;
			rev2 = 0;
			while(num1>0)
			{
				countb++;
				int rem = num1%10;
				rev2 = (rev2*10)+rem;
				num1=num1/10;
			}
			if (numbc<0) 
			{
				flag1=false;
			}
			if (rev2==numbc && rev2!=num) 
			{
				System.out.println("Previous palindrome number of "+num+" = "+rev2);
				flag1=false;
			}
			numbc = numbc -1 ;
		}
		System.out.println("=======================================================");
		if (countf>=countb)
		{
			System.out.println("Nearest palindrome number of "+num+" is "+rev2+" ");
		}
		else if (countb>=countf) 
		{
			System.out.println("Nearest palindrome number of "+num+" is "+rev1+" ");
		}
		
	}
}