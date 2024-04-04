package NewPackage.lamda_interface;

public class Runner 
{
	public static void main(String[] args) {
		/* lamda expression */
		Inshd is =()->{
			System.out.println("interface");
		};
		
		is.method();
		
		/* creating object by using new key word */
		Inshd ref = new Inshd() {
			
			@Override
			public void method() {
				
			}
		};
		
		
		//is.method();
		
		ref.method();
	}
}
