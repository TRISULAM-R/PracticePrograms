package NewPackage.qwerty;


public class twentyfive
{
	public static void main(String[] args) 
	{
		int[] arr = {7,13,12,18,10,16};

		int count = 0;

		for(int i = 0 ; i< arr.length ; i++)
		{
		    for(int j = i+1 ; j<arr.length;j++)
		    {
		        if(arr[i]+arr[j]==25)
		        {
		        	System.out.println(arr[i] +"  "+arr[j]);
		        	 count++;
		        }
		    }
		}

		System.out.println(count);
		
	}
}
