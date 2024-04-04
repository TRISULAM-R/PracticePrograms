package NewPackage.qwerty;

public class Abb 
{
	public static void main(String[] args) {
	
		int count = 0;
		for (char i = 'A'; i <= 'E'; i++)
		{
			count++;
			if (count==1||count==2)
			{
				System.out.print(count+""+i);
			}else if(i=='E')
			{
				System.out.print(i);
			}else {
				System.out.print(i);
				System.out.print(i);
			}
			
		}
	}
}
