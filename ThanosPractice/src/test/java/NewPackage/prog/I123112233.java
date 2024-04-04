package NewPackage.prog;

public class I123112233
{
	public static void main(String[] args) 
	{
		
		/** Method 1 **/

		int num = 123;
		String nums = "";
		while(num>0)
		{
			int i = num%10;
			nums = i+nums;
			num = num/10;
		}
		
		boolean flag = true;
		int count0 = 1;	
		while(flag)
		{
		for (int i = 0; i < nums.length(); i++)
		{
			int count = count0;
			while(count>0) 
			{
			System.out.print(nums.charAt(i));
			count--;
			}
		}
		if (count0==3)
		{
			flag=false;
		}
		count0++;
		System.out.println();
		}
		System.out.println("==============================================");
		
		/** Method 2 **/
		
			int numo=123;
			int num1=0;
			while(numo>0)
			{
				int ld=numo%10;
				num1=num1*10+ld;
				numo=numo/10;
			}
			int con=1;
			for(int j=1;j<=3;j++) {
				
				int num2=num1;
			while(num2>0)
			{
					int ld=num2%10;
					for(int i=1;i<=con;i++)
					{
						System.out.print(ld);
					}
					num2=num2/10;
				}
			con++;
				System.out.println();
			}
}
}