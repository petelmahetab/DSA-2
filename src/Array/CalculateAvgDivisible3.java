package Array;

public class CalculateAvgDivisible3 {
    public static double returnAvg3_Even(int[] n){
        //1. counting and sum of the founded numbers
        int co=0;
        int sum=0;
        //2. Iterate on array
        for (int i = 0; i < n.length; i++) {

            //If % 3 and %2 are ==0 then is ready to add & we get AVG of that
            if(n[i]%3==0 && n[i]%2==0 ){
              // add to sum
              sum+=n[i];
              // increase to count to check next
                co++;
            }
            //case:- sum==0
            if(sum==0){
                return 0;
            }
        }
        //now return
        return (double) sum / co;
    }
    public static void main(String[] args) {
        // This Question is asked in ACCENTURE
//        Calculate the average of numbers that area divisible by 3 and even.
//        you are given an array nums,of size n . you =r task is to return the average of numbers in the array that are both divisible by 3 and even.
        // means we need to calculate avg of those numbers that are divisible by both 3 and even numbers
          int[] nums = {6, 12, 7, 15, 24, 30};
          //Now call this function
        double avg=returnAvg3_Even(nums);
        System.out.println("Avg of even and number of divisible of 3 is:- >   "+avg);

    }
}
