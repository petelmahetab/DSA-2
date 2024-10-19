package Array;

public class Eighteenth {

//                                         Intro
//     KADANE's algorithm ek algo hai joh sirf Contiguous array element pr kaam krta hai. Jabhi bhi kisi 2 or more element ka sum < 0 aata hai.
//    means Negative number toh CurrenTsum hoga 2 elements ka 0 reset kro . Because of woh result negative hai woh next aane wale sum ko decrease karega.
//    aur apna MAXIMUM sum nhi calculate hoga.


    public  static  int returnMaxSumUsingKadanesAlgo(int[] ar){

//        1 . Iterate On Entire Loop
        int curr_sum=0;
        int sum=Integer.MIN_VALUE;
        for (int start = 0; start < ar.length; start++) {
//        2. Current sum array ke First Index me ADD kro
//        3. Find kro mAX ko BETWEEN currentSum and Sum ke beech
//            Important Condition
//        4.  if SUM is less than 0 then
            curr_sum+=ar[start];
            sum=Integer.max(curr_sum,sum);
          if(sum<0){
              curr_sum=0;
          }
        }
return curr_sum;
    }

    public static void main(String[] args) {

        int[] MyArry={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(returnMaxSumUsingKadanesAlgo(MyArry));


        //Find MAXIMUM Sub-Array in given array.
        //Sub array is contiguous array is an sub part of array elements are come after one other.
        //Bruteforce approach means Worst Case Complexity.
        //1 loop start with 0
        //2 end to start
        //3 print 3 loop form start form 1 loop to end 2 loop

        //we uses 3 loops here so COMPLEXITY will be  0(n^3)

//        for (int st = 0; st < MyArry.length; st++) {
//            for (int end = st; end <MyArry.length ; end++) {
//                for (int ls = st; ls <end ; ls++) {
//                    System.out.print(" "+MyArry[ls]);
//                }
//                System.out.println();
//            }
//        }

    }
}
