package practiceProg;

import java.util.Arrays;

public class Array_Append_2_Array_ZigZag {
	
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {11, 22, 33, 44};
        System.out.println(Arrays.toString(appendTwoArrayZigzag(arr1, arr2)));
        
	}
	
	
	
	public static int[] appendTwoArrayZigzag(int[] arr1, int[] arr2)
	{
		int len1=arr1.length;
		int len2=arr2.length;
		int len = len1 + len2;
		int[] newArr = new int [len]; 
		int a=0;
		int b=0;
//		int maxLen = len1;
//		if(len1<len2)
//		{
//			maxLen = len2;
//		}
		for(int i=0; i<newArr.length; i++)
		{try {

			if(i%2==0)
			{
				newArr[i] = arr1[a];
				a++;
			}
			else if(i%2==1){
				newArr[i] = arr2[b];
				b++;
			}
		}
		catch (IndexOutOfBoundsException e) {
//			newArr[i]= arr
		}
		}		
		return newArr;
	}
	
}
