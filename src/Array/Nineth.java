package Array;

public class Nineth {
    // Two-pointer approach to find product of array except itself
    public static void returnProduct(int[] ar, int m) {
        // Initialize left and right product arrays
        int[] left = new int[m];
        int[] right = new int[m];
        int[] result = new int[m];

        // Set the first element of left to 1, as there's no element to the left of the first element
        left[0] = 1;
        // Set the last element of right to 1, as there's no element to the right of the last element
        right[m - 1] = 1;

        // Fill the left array: left[i] contains the product of all elements to the left of ar[i]
        for (int le = 1; le < m; le++) {
            left[le] = left[le - 1] * ar[le - 1];
        }

        // Fill the right array: right[i] contains the product of all elements to the right of ar[i]
        for (int ri = m - 2; ri >= 0; ri--) {
            right[ri] = right[ri + 1] * ar[ri + 1];
        }

        // Fill the result array by multiplying left[i] and right[i]
        for (int i = 0; i < m; i++) {
            result[i] = left[i] * right[i];
        }

        // Print the result array
        for (int i = 0; i < m; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Product of Array Except Itself
        int[] productArr = {1, 2, 3, 4, 5, 6, 7};
        int n = productArr.length;
        returnProduct(productArr, n);
    }
}
// Output will be [5040, 2520, 1680, 1260, 1008, 840, 720]
