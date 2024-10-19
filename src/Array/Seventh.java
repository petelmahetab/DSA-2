package Array;

import java.util.Arrays;

public class Seventh {
//2 approach k tak sra array reverse kar lo aur oske baad comnbination of all remaining array will also reverse
    // Method to reverse the sub-array from 'left' to 'right'
    public static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    // Method to rotate the array by 'k' positions
    public static void rotate(int[] a, int k) {
        // Ensure 'k' is within the bounds of the array length
        k %= a.length;

        // 1. Reverse the entire array
        reverse(a, 0, a.length - 1);

        // 2. Reverse the first 'k' elements
        reverse(a, 0, k - 1);

        // 3. Reverse the remaining 'n - k' elements
        reverse(a, k, a.length - 1);
    }

    public static void  main(String[] args) {
        // Rotate the array by 3 places
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));  // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
