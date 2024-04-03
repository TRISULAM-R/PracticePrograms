package practiceProg;

public class Array_Append_2_Arrays {

	public static void main(String[] args) {


        // first array 
        int a[] = { 30, 25, 40 }; 
        // second array 
        int b[] = { 45, 50, 55, 60, 65 }; 
        
       int a1= a.length, b1= b.length;
       
       int c= a1+b1;
       
       int[] result = new int [c];
       
       for(int i=0; i<a1; i++)
       {
    	   result[i]= a[i];
       }
       
       for(int j=0; j<b1; j++)
       {
    	   result[a1+j] = b[j];
       }
       
       for(int k=0; k<result.length; k++)
       {
    	   System.out.println(result[k]);
       }
	}
}
