public class BookAllocation {
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
