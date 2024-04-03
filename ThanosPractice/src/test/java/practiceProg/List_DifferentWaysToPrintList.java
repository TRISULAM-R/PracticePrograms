package practiceProg;

import java.util.Iterator;
import java.util.*;

public class List_DifferentWaysToPrintList {

	public static void main(String[] args) {
		
		 List<Integer> list = new LinkedList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        
	        List_DifferentWaysToPrintList printArray= new List_DifferentWaysToPrintList();
				
	        printArray.usingForLoop(list);
	        printArray.usingForEachLoop(list);
	        printArray.usingIterator(list);
	        printArray.usingListIterator(list);
	        printArray.usingListIteratorBackWard(list);
			
	}
	
	public void usingForLoop(List<Integer> list)
	{
		//Using Simple for loop
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(list.get(i));
	        }
	}
	
	public void usingForEachLoop(List<Integer> list)
	{
		//Using Foreach Loop
		for(Integer lst : list)
		{
			System.out.println(lst);
		}
	}
	
	
	public void usingIterator(List<Integer> list)
	{
      Iterator<Integer> iterator = list.iterator();
      
      //Using Iterator
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }
	}
	
	public void usingListIterator(List<Integer> list)
	{
		   ListIterator<Integer> listIterator = list.listIterator();
	        
	        // Using ListIterator
	        System.out.println("Iterating forward:");
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }
	}
	
	public void usingListIteratorBackWard(List<Integer> list)
	{
		   ListIterator<Integer> listIterator = list.listIterator();
	        
		    // Using ListIterator backward
	        System.out.println("Iterating backward:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	}

}
