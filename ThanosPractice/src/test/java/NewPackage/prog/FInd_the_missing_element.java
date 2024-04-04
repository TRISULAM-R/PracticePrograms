package NewPackage.prog;


public class FInd_the_missing_element {

	public static void main(String[] args)
	{
		String[] arr = {"abc","def","ghi","jkl"};
		
		String exp_ele  = "ab";
		
		boolean flag = true;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (exp_ele.equals(arr[i]))
			{
				flag = false;
			}
		}
		
		if (flag) 
		{
			System.out.println(exp_ele+" is missing");
		}else {
			System.out.println(exp_ele+" is present");

		}
		
		
		//////////////////////////////////////////////////////////////
		
		String[] arr1 = {"abc","def","ghi","jkl"};
		String[] arr2 = {"abc","def","ghi","jkl","mno"};

		int length = arr1.length;
		if (arr1.length<arr2.length)
		{
			length = arr2.length;
		}
		
		for (int i = 0; i < length; i++)
		{
			
		}
		
		

	}

}
