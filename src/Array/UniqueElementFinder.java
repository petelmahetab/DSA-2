package Array;

public class UniqueElementFinder {

    public static int findUnique(int[] array) {
        int ans = 0;  // Initialize result to 0

        // Iterate through each element in the array
        for (int num : array) {
            ans = ans ^ num;  // XOR the current number with ans
        }

        // ans now holds the unique element
        return ans;
    }

    public static void main(String[] args) {
        // Example array where every element appears twice except one unique element
        int[] myArray = {1, 3, 2, 3, 1, 3, 5, 1, 2, 5};

        // Find and print the unique element
        int uniqueElement = findUnique(myArray);
        System.out.println("The unique element is: " + uniqueElement);
    }
}
