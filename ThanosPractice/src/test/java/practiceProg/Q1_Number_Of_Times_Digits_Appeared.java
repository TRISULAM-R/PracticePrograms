package practiceProg;

import java.util.Scanner;

public class Q1_Number_Of_Times_Digits_Appeared {

	public static void main(String[] args) {
		
	// 1.Write a program in Java to calculate the number of times a digit ‘D’ appears in a number N. You have to take N and D as inputs from the user.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println("Enter target number");
		int target = sc.nextInt();
		System.out.println(checkDigitsAppeared(num, target));
		sc.close();
		

	}
	
	static int checkDigitsAppeared(int num, int target)
	{
		int count=0;
		while(num>0)
		{
			int temp = num%10;
			if(temp==target)
			{
				count++;
			}
			num=num/10;
		}
		return count;
	}
	
}
