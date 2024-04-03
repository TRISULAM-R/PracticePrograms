package practiceProg;

public class Q3_Prove_String_Is_Immutable_In_Java {

	public static void main(String[] args) {

		String s1="java";
		String s2=s1.concat("Class");
		
		System.out.println("Hash code of s1 = "+s1.hashCode());
		System.out.println("Hash code of s2 = "+s2.hashCode());	
	
	}	
}
