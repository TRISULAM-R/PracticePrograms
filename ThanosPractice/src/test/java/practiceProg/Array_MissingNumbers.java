package practiceProg;

public class Array_MissingNumbers {

	public static void main(String[] args) {
		
		int[] ar = {2,5,8,11,12};
		
		for(int i=0; i<ar.length-1; i++)
		{
			for(int j=ar[i]+1; j<ar[i+1]; j++)
			{
				System.out.println(j);
			}
		}
		
	}
}
