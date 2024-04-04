package NewPackage.prog;

public class ASDFG 
{
	public static void main(String[] args) 
	{
		int num = 49;
		int numc = num;
		int sum = 0;
		boolean flag = true;
		while(flag)
		{
		while(num>0)
		{
			int ld = num%10;
			int squre = ld*ld;
			num=num/10;
			sum = sum+squre;
		}
		num=sum;
		sum=0;
		if (num==1||num==4)
		{
			flag=false;
		}
		}
		if (num==1)
		{
			System.out.println(numc + " is a happy number ");
		}else {
			System.out.println(numc + " is not a happy number ");

		}
	}
}
