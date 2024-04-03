package practiceProg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Array_Print_Occurance_Using_Map {
	
	
	public static void main(String[] args) {
		
		int[] ar = {1,3,4,4,6,3,5,3,1};
		
		
		Map<Integer, Integer> map = new LinkedHashMap();
		
		for(int i=0; i<ar.length; i++)
		{
			map.put(ar[i], i+1);
		}
		
		for(Entry<Integer, Integer> m : map.entrySet())
		{
			int count =0;
			for(int i=0;i<ar.length; i++)
			{
				if(m.getKey()==ar[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("Occurance of "+m.getKey()+" is "+count+" ");
			}
			
		}
	}

}
