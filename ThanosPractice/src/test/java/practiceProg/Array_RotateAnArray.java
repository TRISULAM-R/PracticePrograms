package practiceProg;

import java.util.Arrays;
import java.util.Iterator;

public class Array_RotateAnArray {

	public static void main(String [] args)
	{
		int arr[] = {1,3,4,5,6,8,9};
		int num=2;
		int [] temp = rotateAnArray(arr, num);
		for(int i=0; i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
		
	}
	static int[] rotateAnArray(int[] arr, int num)
	{
		int len =arr.length;
		int temp[]= new int [len];
		int tempnum=0;
		for(int i=num; i<len;i++)
		{
			temp[tempnum]=arr[i];
			tempnum++;
		}
		for(int i=0; i<num; i++)
		{
			temp[tempnum]=arr[i];
			tempnum++;
		}
		return temp; 
	}
}
