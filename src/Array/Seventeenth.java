package Array;

import java.util.*;

public class Seventeenth {

    // Function to return all triplets whose sum equals 0
    public static List<List<Integer>> returnTripletSumAMtches(int[] ar, int n1) {
        // Use a Set to store unique triplets
        Set<List<Integer>> mySet = new HashSet<>();

        // Step 1: Sort the given array
        Arrays.sort(ar);

        // Step 2: Iterate through the array
        for (int i = 0; i < ar.length - 2; i++) {
            // Skip duplicate elements for the first element
            if (i > 0 && ar[i] == ar[i - 1]) {
                continue;
            }

            // Two-pointer approach
            int left = i + 1;
            int right = n1 - 1;

            // Step 3: Use two pointers to find valid triplets
            while (left < right) {
                int sum = ar[i] + ar[left] + ar[right];

                // Case 1: If sum equals 0, we found a triplet
                if (sum == 0) {
                    mySet.add(Arrays.asList(ar[i], ar[left], ar[right]));

                    // Skip duplicate elements for left and right pointers
                    while (left < right && ar[left] == ar[left + 1]) left++;
                    while (left < right && ar[right] == ar[right - 1]) right--;

                    // Move both pointers
                    left++;
                    right--;
                }
                // Case 2: If sum is less than 0, move the left pointer to increase the sum
                else if (sum < 0) {
                    left++;
                }
                // Case 3: If sum is greater than 0, move the right pointer to decrease the sum
                else {
                    right--;
                }
            }
        }

        // Convert Set back to List to return
        return new ArrayList<>(mySet);
    }

    public static void main(String[] args) {
//        // Example input array
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int n = nums.length;
//
//        // Call the returnTripletSumAMtches method and print the result
//        List<List<Integer>> result = returnTripletSumAMtches(nums, n);
//        System.out.println(result); // Expected Output: [[-1, -1, 2], [-1, 0, 1]]



    }
}
