package Array;

public class ThirtyThree {
    //Mountain Array find peak ELEMENTS.
//    I use Binary Search FOR better Optimization logn()
//

    public static void main(String[] args) {
        int[] myAr={0,4,2,8,1,0};
        System.out.println(getIndex(myAr));
    }

    private static int getIndex(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if we're in the decreasing part of the mountain
            if (a[mid] > a[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1; // peak is to the right, excluding mid
            }
        }

        return low;

    }

}
