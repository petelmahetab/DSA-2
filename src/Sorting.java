public class Sorting {

    public static void main(String[] args) {
//       We have different type of sorting ALGORITHM are used for SORTING and not we are using in ACTUAL DSA but for INTERVIEW's WE need that.
        int[] ar={4,1,5,2,3,8,6,7};
        int n=ar.length;
        int[] newAr=returnSOrtingUsingBubbleSort(ar,n);
        System.out.println("Using Bubble Sort");
        for(int i:newAr){
            System.out.print(" "+i);
        }
        System.out.println();
        int[] newAr1=returnSortingUsingSelectionSort(ar,n);
        System.out.println("Using Selection Sort");
        for (int i:newAr1){
            System.out.print(" "+i);
        }
        System.out.println();
        int[] newAr2=returnSortingUsingInsertionSort(ar,n);
        System.out.println("Using Insertion Sort");
        for (int i:newAr2){
            System.out.print(" "+i);
        }
    }

    private static int[] returnSortingUsingInsertionSort(int[] ar, int n) {
//        Steps:- Loop through Entire Length of an ARRAY  and new start and previous which is previous index.
//        loop condition previous index is greater and array of previous element will be greater current, then assign next previous index to previous and previous substract
        for (int i = 1; i < n-1; i++) {
            int current=ar[i];
            int pre=i-1;

            while(pre >= 0 && ar[pre] > ar[current]){
                ar[pre+1]=ar[current];
                pre--;
            }
//            for placing the current element in its correct position.
            ar[pre+1]=current;
        }

        return ar;
    }

    public static int[] returnSortingUsingSelectionSort(int[] ar, int n) {
//        Length will be n-1 and check next of i will be less than && i then swap.
        for (int i = 0; i <n-1 ; i++) {
            int SmallIndex=i; // Finding index in SORTED ARRAY
            for (int j = i+1; j < n; j++) {

                if(ar[j] < ar[SmallIndex]) {
                    SmallIndex = j;
                }
            }
//            Swap OUTSIDE
            int t=ar[SmallIndex];
            ar[SmallIndex]=ar[i];
            ar[i]=t;
        }
        return ar;
    }

    public static int[] returnSOrtingUsingBubbleSort(int[] ar, int n) {
//        Step goes till the length of n-1 and and compare current and next and then SWAP.
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
//
                if (ar[j] > ar[j+1]){
                    int t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        return ar;
    }
}
