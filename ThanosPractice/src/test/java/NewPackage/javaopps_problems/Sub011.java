package NewPackage.javaopps_problems;

public class Sub011 extends Super011
{
	public void method2()
	{
		System.out.println("method 2 sub");
	}
	
	public void method3()
	{
		System.out.println("method 3 sub");
	}
	
	public void method5()
	{
		System.out.println("method 5 sub");
	}
	
	public static void main(String[] args) {
		Super011 ss = new Sub011();
		ss.method1();
		ss.method2();
		ss.method3();
		ss.method4();
		ss.method3();
	
		
		
	}
}
