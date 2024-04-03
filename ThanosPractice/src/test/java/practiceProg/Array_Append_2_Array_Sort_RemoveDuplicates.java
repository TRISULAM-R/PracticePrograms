package practiceProg;

import java.util.*;

public class Array_Append_2_Array_Sort_RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] array1 ={1,3, 90, 39, -9, 49};
        int[] array2 ={39, 49, 10, 0, -1, 89};

        Set<Integer> set =new LinkedHashSet();

        int length = array1.length + array2.length;

        int [] newArray = new int[length];
        int templength = array1.length;
        int j=0;

        for(int i=0; i<length; )
        {
            if(i<templength)
            {
                newArray[i] = array1[i];
            }
            else{
            newArray[i] = array2[j];
                j++;
             }
            i++;
        }

            for(int i=0; i<newArray.length; i++)
            {
                for(int k=i+1; k<newArray.length; k++)
                {
                    if(newArray[i]>newArray[k])
                    {
                        int temp = newArray[k];
                        newArray[k] = newArray[i];
                        newArray[i] = temp;
                    }
                }
            }


        for(int i=0; i<newArray.length; i++)
        {
            set.add(newArray[i]);
        }

        for(Integer in : set)
        {
            System.out.print(in+" ");
        }
    }
}
