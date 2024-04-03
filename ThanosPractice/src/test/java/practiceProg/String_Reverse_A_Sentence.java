package practiceProg;

public class String_Reverse_A_Sentence {

	public static void main(String[] args) {

		String s="i love java"; //o/p: java love i
		String[] ch= s.split(" ");
		String temp="";
		for(int i=ch.length-1; i>=0; i--)
		{
			temp=temp+(ch[i]+" ");
		}
		System.out.println(temp);
	}

}
