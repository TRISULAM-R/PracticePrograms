package NewPackage.one;

public class Demo 
{

	public static void main(String[] args) {
		
		//////////////////////////////////
		
		Parent p = new Parent();
		p.drink();
		
		/////////////////////////////////
		
		Child c = new Child();
		c.drink();
		
		////////////////////////////////
		
		Grantchild gc = new Grantchild();
		gc.drink();
		
		///////////////////////////////
		System.out.println("============================");
		Child g1 = new Grantchild();
		g1.drink();
	}
}
