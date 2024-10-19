package Array;

import java.util.Arrays;

public class Thirteenth {
    public static void main(String[] args) {
        //Merge Array with different sizes

        int[] a={20,306,6,9,0,34,65,-9};
        int[] b={0,1,3,60,89};
        int[] NewArray=new int[a.length+b.length];
        //Use System.Arraycopy:-> 5 para > first array , source starting index, MergedArray , destination , Length of first array or any array
        System.arraycopy(a,0,NewArray,0,a.length);
        System.arraycopy(b,0,NewArray,a.length,b.length);
        Arrays.sort(NewArray);
        //Return Array as String
        System.out.println(Arrays.toString(NewArray));
    }
}

//We get the output
