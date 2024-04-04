package NewPackage.javaopps_problems;

public class Sub_bnk
{
	public static void main(String[] args) {
		
		Super_bnk sb = new Super_bnk();
		System.out.println(sb.getBal());
		sb.setBal(1000);
		System.out.println(sb.getBal());

	}
}
