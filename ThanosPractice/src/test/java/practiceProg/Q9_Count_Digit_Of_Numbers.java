package practiceProg;

import java.awt.Robot;

public class Q9_Count_Digit_Of_Numbers {

	public static void main(String[] args) {
		
	//Write a program in Java to count the digits in a number.
		int num= 35433463;
		System.out.println(countDigitsInANumber(num));
		
//		Robot robot = new Robot();
//		robot.ke
	}
	
	static int countDigitsInANumber(int num)
	{
		int count=1;
		for(int i=0; i<num; i++)
		{
			count++;
			num =num/10;
		}
		return count;
	}
}
