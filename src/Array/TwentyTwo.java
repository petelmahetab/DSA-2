package Array;

public class TwentyTwo {
    //1.Using Linear Search 0(n)
    public static int returnMinElement(int[]ar,int n){
        //initializes 0 index of array
        int minValue=ar[0];
        //Iterate on ARRAY
        for (int i = 1; i < ar.length; i++) {
            if(ar[i] <minValue)
            {
                minValue=ar[i];
                System.out.print("Index will be:-->  "+i);
                System.out.println();
            }
        }

        return minValue;
    }

    //2.Using Binary Search 0(long n)
    public static int returnMinUsingBinarySearch(int[] ar,int n){
//        int minVal=Integer.MAX_VALUE;
        //It works on Divide & Conquer method
        int low = 0;
        int high = ar.length - 1;

        // Binary search
        while (low < high) {
            // Find the middle element
            int mid = low + (high - low) / 2;

            // Compare mid element with high element
            if (ar[mid] > ar[high]) {
                // Minimum must be in the right half
                low = mid + 1;
            } else {
                // Minimum must be in the left half (or could be mid itself)
                high = mid;
            }
        }

        // At the end of the loop, low == high, and this is the minimum element
        return ar[low];
    }

    public static void main(String[] args) {
        //We have to find MINIMUM elements in SORTED and ROTATED ARRAY.
        int[] ar={5,6,-1,2,3,4};
        int n=ar.length;
//        System.out.println();
        System.out.println("Element is:->  "+returnMinElement(ar,n));

        System.out.println("Element using Binary :->  "+returnMinUsingBinarySearch(ar,n));
    }
}
