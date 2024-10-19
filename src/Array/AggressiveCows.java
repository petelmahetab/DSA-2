package Array;

import java.util.Arrays;

public class AggressiveCows {

//    Allocate Cows
    public static void main(String[] args) {
        int N=5;
        int Cows=3;
     int[] ar={1,2,8,4,9};
        System.out.println(allocatesCows(N,Cows,ar));
    }

    private static int allocatesCows(int n,int c,int[] a) {
        Arrays.sort(a);
        System.out.println(" After Sorted "+Arrays.toString(a));
        int ans=0;
        int start=a[0];int end=n-1;
        while(start <= end){
//
            int mid=start+(end-start)/2;
            if(isFound(a,n,c,mid)){
                ans=mid;
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return ans;
    }

    private static boolean isFound(int[] a, int n, int c, int maxAllowed) {
        int cow=1;
        int lastStall=a[0];

        for (int i = 0; i < n; i++) {
            if(a[i]-lastStall >=maxAllowed){
                cow++;
                lastStall=a[i];
            }

            if(cow==c){
                return  true;
            }
        }
        return false;

    }

    public static class BookAllocation {
        public static int allocateBooks(int[] a, int n, int stu) {
            // If students are more than the number of books, it's not possible to allocate
            if (stu > n) {
                return -1;
            }

    //        Maximum sum FIND out
            int sr = a[0]; // Starting with the maximum element
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
                sr = Math.max(sr, a[i]); // Find the maximum element
            }
            int end = sum;
            int ans = -1;

            // Binary search
            while (sr <= end) {
                int mid = sr + (end - sr) / 2;
                if (isvalid(a, n, stu, mid)) {
                    ans = mid; // Store the potential answer
                    end = mid - 1; // Try to minimize the maximum pages
                } else {
                    sr = mid + 1; // Increase the minimum allowed value
                }
            }
            return ans;
        }

        // Check if we can allocate books to all students such that no student gets more than maxallowed pages
        private static boolean isvalid(int[] a, int n, int stu, int maxallowed) {
            int student = 1; // At least one student
            int pages = 0;

            for (int i = 0; i < n; i++) {
                // If pages allocated exceed maxallowed, then assign to the next student
                if (pages + a[i] > maxallowed) {
                    student++;
                    pages = a[i]; // Allocate the current book to the next student
                    if (student > stu) { // If students exceed limit
                        return false;
                    }
                } else {
                    pages += a[i]; // Add the current book's pages to the current student
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int N = 4;
            int[] pages = {12, 34, 67, 90};
            int M = 2;

            System.out.println(allocateBooks(pages, N, M));
            // Output: 113
        }
    }

    public static class Eigtht {
        // Approach: O(n^2) - Sorting + Checking adjacent elements
        public static void returnDuplicate(int[] ar, int n1) {
            boolean result = false;

            // Loop through the array using indices
            for (int i = 0; i < n1; i++) {
                // Check if consecutive elements are duplicates
                if (ar[i] == ar[i + 1]) {
                    // Ensure not to print the same duplicate multiple times
                    if (i == 0 || ar[i] != ar[i - 1]) {
                        System.out.print(" "+ar[i]);
                    }
                    result = true;
                }
            }

            // If no duplicates are found, print "Not Found"
            if (!result) {
                System.out.println("Not Found");
            }
        }

        public static void main(String[] args) {
            // Find duplicates in the given array and return them
            int[] myArr = {1, 2, 3, 6, 3, 6, 1};
            int n = myArr.length - 1;

            // Sort the array so that duplicates are adjacent
            Arrays.sort(myArr);

            // Call the function to find and print duplicates
            returnDuplicate(myArr, n);
        }
    }

    public static class Eleventh {

        public static int returnPeakElement(int[] a, int n1) {
            // Handle cases with only one element
            if (n1 == 1) {
                return a[0];
            }

            // Handle cases where the first element is a peak
            if (a[0] > a[1]) {
                return a[0];
            }

            // Handle cases where the last element is a peak
            if (a[n1 - 1] > a[n1 - 2]) {
                return a[n1 - 1];
            }

            // Iterate through the array to find a peak element
            for (int i = 1; i < n1 - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    return a[i];
                }
            }

            // No peak found, though in theory this shouldn't happen with a valid peak definition
            return -1; // Returning -1 to indicate no peak found
        }

        public static void main(String[] args) {
            // Find a peak element in the given array
            int[] thisArray = {1, 3, 20, 4, 1, 0};
            int n = thisArray.length;
            System.out.println("Peak element is=>  "+returnPeakElement(thisArray, n));
        }
    }
}
