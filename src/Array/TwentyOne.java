package Array;

public class TwentyOne {
    /*
    We have 2 apporaches for solving question
    1.2Pointer .
    steps:-> left array 0 index and right will be start from length -1-i

    */
    public static int getReturnMaxSubArrProduct(int[] ar,int n1){
        int result=Integer.MIN_VALUE;// it Get minimum to minimum values in given array
        //2 pointer's :-> left to right , right to left
        int leftPointer=1;
        int rightPointer=1;
        //Traverse array
        for (int i = 0; i < n1; i++) {
            //Product of current leftpointer and next Element
            leftPointer*=ar[i];
            rightPointer*=ar[n1-1-i];
            // Find max product of both of them left and right-pointer
            result=Math.max(leftPointer,rightPointer);

            //we got it but If product will be 0 then leftpointer and rightpointer again reset to 1;
            if(leftPointer==0){
                leftPointer=1;
            }
            if(rightPointer==0){
                rightPointer=1;
            }
        }
        return result;
    }

    //2 Approach using KADANE's Algo
    /*We have to maintain 2 max and min for if we got (-)Ve values
    * then we have get maximum negative and minimum negative as output for next multiplication.*/
    public static int returnMaxSubArrProductUsingKaden(int[] ar,int n1){
        int max=ar[0];
        int min=ar[0];
        int result=max;

        //iterate on array
        for (int i = 1; i < n1; i++) {
            //create an temporary Max and current index
            int current_index=ar[i];
            //max will be calculated using current and max ,min

            int tempMax=Math.max(current_index,Math.max(current_index*max,current_index*min));
             min=Math.min(current_index,Math.min(current_index*max,current_index*min));

             //now Updates max when min is updated.
            max=tempMax;
            //now Updates the max and again max between max and result
            result=Math.max(result,max);
        }

        return result;
    }
    public static void main(String[] args) {
        //We have to Find MAXIMUM Product of given SUBARRAY from Array.
        int[] myARr={6,-3,-10,0,2};
        int n=myARr.length;
        System.out.println(getReturnMaxSubArrProduct(myARr,n));
        int[] myARr1={6,-3,-10,0,2};
        int n2=myARr.length;
        System.out.println(returnMaxSubArrProductUsingKaden(myARr1,n2));
    }
}
