package NewPackage.jp;

public class SubClass extends SClass
{
	int a = 20;
	public SubClass() 
	{
		System.out.println("non parameteried method from SubClass");
	}	
	
	public SubClass(int y)
	{
		System.out.println("parametersized method from SubClass");
		System.out.println(y);
	}
	
	public static void main(String[] args) 
	{
		int a = 30;
		//this a = 10;
		//changes in feature/new
	}
}
