package practiceProg;

import java.util.HashMap;
import java.util.*;

public class Array_Print_Index_Equals_9_Ibm_Interview {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int[] ar = { 2, 8, 7, 5,7,3,9,15 };
		int target = 9;

		for (int i = 0; i < ar.length; i++) {
			map.put(i, ar[i]);
		}

		for (int i = 0; i < ar.length; i++) {
			for (Map.Entry<Integer, Integer> m : map.entrySet()) {
				if ((ar[i] + m.getValue()) == target) {
					System.out.println(i + " " + m.getKey());
				}
			}
		}
	}
}
