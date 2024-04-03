package programPractice100;

public class PrintIntegerInJava {

	
	public void printInteger1()
	{
		System.out.println("Integer");
	}
	
	public void printInteger2()
	{
		Integer integer = Integer.valueOf(10);
		System.out.println(integer);
	}
	
	public void printInteger3()
	{
		for (int i = 1; i <=10; i++) {
			
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		
		PrintIntegerInJava printIntegerInJava = new PrintIntegerInJava();
		printIntegerInJava.printInteger1();
		printIntegerInJava.printInteger2();
		printIntegerInJava.printInteger3();
	}

}
