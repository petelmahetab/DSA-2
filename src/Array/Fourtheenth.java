package Array;

import java.util.PriorityQueue;

public class Fourtheenth {
    //First Sort and second largest will be is element is K element
    //1 Approach
//    public static int returnKValue(int [] a,int m1){
//        // Sort  the given Array
//        Arrays.sort(a);
//        // length substract with K Element
//        return a[a.length-m1];
//    }
    //2 Approach :-> Using Min-heap Approach for implementing PriorityQueue .
    public static  int returnKValue(int[] a,int m1){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(m1);

        // Step 2: Iterate over the array
        for (int num : a) {
            // Add the element to the heap  offer method for adding elements.
            minHeap.offer(num);

            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > m1) {
                minHeap.poll();  // This removes the root of the heap (the smallest element)
            }
        }

        // Step 3: The root of the heap is now the Kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        //Find K Elements in given Array
        int[] myArray={10,30,6,9,5,3,0,4,8,4};
        int n=myArray.length;
        int k=5;
//        System.out.println(n);
        System.out.println("The Difference between length and K value is:==>  "+returnKValue(myArray,k));
    }
}
