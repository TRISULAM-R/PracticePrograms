package NewPackage.javaopps_problems;

public class Method_overriding_sub extends Method_overriding_super
{
	
	public void method1()
	{
		System.out.println(" method1 -- sub");
	}
	
	public static void main(String[] args) 
	{
		Method_overriding_sub mos = new Method_overriding_sub();

		mos.method1();
	}
}
