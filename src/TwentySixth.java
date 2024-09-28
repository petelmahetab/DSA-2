public class TwentySixth {

    //Approach were we have find an Solution which contain most water as area=width*height
    public static int MostWater(int a[], int n) {
        int strt = 0;//Staring current index 0
        int end = n - 1;//Start end -1
        int ans = 0; //Store The actual Area of the container which have maximum.

        // Loop through until start crosses end
        while (strt < end) {
           //For width we need distance between next and starting point index.
            int width = end - strt;
            //Height is uses for finding minimum between start and end pointer
            int height = Math.min(a[strt], a[end]);

            // Calculate the area of the container
            int area = height * width;

            // Update the maximum area
            ans = Math.max(area, ans);

            // move when start is less than end
            if (a[strt] < a[end]) {
                strt++;
            } else {
                end--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,3};
        int n = arr.length;
        System.out.println("The CONTAINER :-> "+MostWater(arr, n));  // Expected Output: 6
    }
}
