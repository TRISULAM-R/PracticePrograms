
	import java.util.Scanner;
	import java.util.Arrays;

	public class Demo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the size of the array
	        int N = scanner.nextInt();

	        // Read the array elements
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Find and print the maximum difference
	        int maxDifference = findMaxDifference(arr);
	        System.out.println(maxDifference);

	        scanner.close();
	    }

	    private static int findMaxDifference(int[] arr) {
	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // Find the maximum difference between consecutive elements
	        int maxDifference = 0;
	        for (int i = 1; i < arr.length; i++) {
	            int difference = arr[i] - arr[i - 1];
	            if (difference > maxDifference) {
	                maxDifference = difference;
	            }
	        }
	        return maxDifference;
	    }
	}



