package NewPackage.javaopps_problems;

public class Method_overloading 
{
//	public void test(int a)
//	{
//		System.out.println("i am integer parameterized");
//	}
	
	public void test(String a)
	{
		System.out.println("i am String parameterized");
	}
	
//	public void test(float a)
//	{
//		System.out.println("i am float parameterized");
//	}
	
	public void test(double a)
	{
		System.out.println("i am double parameterized");
	}
	
//	public void test(char a)
//	{
//		System.out.println("i am char parameterized");
//	}
	
	public static void main(String[] args) {
		Method_overloading mo = new Method_overloading();
		mo.test('d');
	}
}
