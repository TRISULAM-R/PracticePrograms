package NewPackage.prog;

public class count_number_of_car {

	public static void main(String[] args) 
	{
		String s = "cartraincarbikecarbus";
		
		/** method 1 **/
		
		int length_total = s.length();
		String word = "car";
		int length_car = word.length();
		String[] ss = s.split(word);
		int length = 0;
		
		for (String string : ss)
		{
			length = length+string.length();
		}
		int diff = length_total-length;
		int count = diff/length_car;
		System.out.println("number of times the "+word+" is repeated = "+count);
		
		System.out.println("");
		System.out.println("===============================================");
		System.out.println("");

		/** method 2 **/
		
		int count1 = 0;
		String str = "";
		for (int i = 0; i < s.length()-1; i++) 
		{
			str = str+s.charAt(i);
			str = str+s.charAt(i+1);
			str = str+s.charAt(i+2);
			if (str.equals("car"))
			{
				count1++;
				i=i+2;
			}
			if (i==s.length()-3) 
			{
				break;
			}
			str="";
		}
		System.out.println("number of times the car is repeated = "+count1);
	}
}
