package NewPackage.jp;

public class SClass 
{
	int a = 10;
	public SClass() 
	{
		System.out.println("non parameteried method from superclass");
	}	
	
	public SClass(int y)
	{
		System.out.println("parametersized method from superclass");
		System.out.println(y);
	}
}
