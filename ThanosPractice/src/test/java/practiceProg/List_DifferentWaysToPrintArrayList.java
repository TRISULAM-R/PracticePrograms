package practiceProg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_DifferentWaysToPrintArrayList {

	public static void main(String[] args) {
		
		 ArrayList list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        
	        List_DifferentWaysToPrintArrayList printArray= new List_DifferentWaysToPrintArrayList();
				
	        printArray.usingForLoop(list);
	        printArray.usingForEachLoop(list);
	        printArray.usingIterator(list);
	        printArray.usingListIterator(list);
	        printArray.usingListIteratorBackWard(list);
			
	}
	
	public void usingForLoop(ArrayList<Integer> list)
	{
		//Using Simple for loop
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(list.get(i));
	        }
	}
	
	public void usingForEachLoop(ArrayList<Integer> list)
	{
		//Using Foreach Loop
		for(Integer lst : list)
		{
			System.out.println(lst);
		}
	}
	
	
	public void usingIterator(ArrayList<Integer> list)
	{
        Iterator<Integer> iterator = list.iterator();
        
        //Using Iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
	
	public void usingListIterator(ArrayList<Integer> list)
	{
		   ListIterator<Integer> listIterator = list.listIterator();
	        
	        // Using ListIterator
	        System.out.println("Iterating forward:");
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }
	}
	
	public void usingListIteratorBackWard(ArrayList<Integer> list)
	{
		   ListIterator<Integer> listIterator = list.listIterator();
	        
		    // Using ListIterator backward
	        System.out.println("Iterating backward:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	        }
	}
}
