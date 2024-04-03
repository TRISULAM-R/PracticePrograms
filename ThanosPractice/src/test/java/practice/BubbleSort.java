package practice;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a = {19,7,6,6,5,4,7,67};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
		
		for(int k =0; k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
