package Array;

import java.util.Arrays;

public class Nineteenth {
//    We have to return an Majority of Elements using Brute-Force.
//    The element count is greater half of the Length of array.

    //Using Brute Force
//steps: 2 times we iterate the LOOP 0(n^2)
    public  static int returnMajorityBruteForce(int[] ar) {
        int freq=0;
        for (int MajorityEle :ar){
            //for counting an Frequency of elements

            for (int element:ar){
                if(element==MajorityEle){
                    //if the we got the same element then Increase the Frequency.
                    freq++;
                }
                //now check if frequency is greater than half of length of array then return an Majority.
                if(freq >ar.length/2){
                    return MajorityEle;
                }
            }
        }
        //we not get an Majority then
        return freq;
    }

    //Optimize Approach
//steps:
    public static int returnMajorityOptimized(int[] ar){
//        1. Sort the Array.0(n Log n)
        Arrays.sort(ar);
//        2.Loop on arr 0(n)
        int fre=1;
        int ans=ar[0];
        for (int MajElem:ar){
            // Answer array ka 0 index

            //2 cases :- present and next wala element hai na woh equal hua toh Fre increase kr do
//            nhi toh frequency ko 1 set karke current i hoga woh result hoga
            if(ar[MajElem]==ar[MajElem-1]){
                fre++;
            }else{
                fre=1;
              ans=ar[MajElem];
            }

            if(fre >ar.length/2){
                return fre;
            }
        }
        return fre;
    }

//    3. Approach MOORE's Voting Algorithm.
//    IT said that not need to sort an given Array .
//    If we get Answer is same then , increase the count of Frequency. but not same then decrease the Frequency value.
//    After returning it works as POWER one after another.

    public static int returnMajorityMooresAlgo(int[] ar){
//        steps: both frequecy and answer will be 0 at starting point.
        int ans=0;
        int freq=0;
        //Iterate on loop
        for (int i = 0; i < ar.length; i++) {
            if(freq==0){
                ans=ar[i];
            }
            else if(ans ==ar[i]){
                freq++;
            }else {
                freq--;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

//        Majority of Elements in Given ARRAY.
//        We have to use to brute force to Full Optimized Approach.

        int [] arr={1,2,2,2,3,5,2,1,3,6,2};
        System.out.println("Majority Element will be:->  "+returnMajorityBruteForce(arr));
        System.out.println("Majority Element using Sortin :-> "+returnMajorityBruteForce(arr));
        System.out.println("Majority Element using Moore's Algo :-> "+returnMajorityMooresAlgo(arr));

    }
}
