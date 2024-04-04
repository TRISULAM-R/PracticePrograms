package NewPackage.integer;

import java.util.Scanner;

public class Rotating_elements_clockwise_in_an_array 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter key"); 
		System.out.println("");

		int key= sc.nextInt();
		
		int[] a = {1,2,3,4,5}; 

		/** method 1 **/
		
		for (int i = key; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < key; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("");
		System.out.println("===================================================");
		System.out.println("");

		/** method 2 **/

		for (int i = 0; i < key; i++)
		{
			int temp = a[0];
			 					
			for (int j = 0; j < a.length-1; j++) 
			{
				a[j]=a[j+1]; 
			}
			a[a.length-1] = temp; 
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
}
