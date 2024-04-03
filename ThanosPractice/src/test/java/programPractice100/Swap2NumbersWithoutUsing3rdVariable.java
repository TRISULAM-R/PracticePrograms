package programPractice100;

public class Swap2NumbersWithoutUsing3rdVariable {

	
	public static void swapTwoNumbersWithout3rdVariable(int num1, int num2)
	{
		num1=num1+num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println(num1+ " "+ num2);
	}
	
	
	
	
	public static void main(String[] args) {

		swapTwoNumbersWithout3rdVariable(1,2);
	}

}
