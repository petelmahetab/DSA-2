package Array;

import  java.util.Arrays;
public class One {
//    Two--Sum
//    Discription :-  We have an Array with some elements and key/target value .We need to check which of the 2 element in array
//    sum will be equals to Given target and Return those Indexes. For calculating only single time use each element in array..

// 3 Ways to solve that question
//    1. loop Complexity will be O(n^2)
//    public static  int[] CalaculatingSum(int[] ar,int k){
////        int[] result;
//        for(int i=0;i<ar.length-1;i++){
//            for(int j=i+1;j< ar.length;i++){
//                if(ar[i]+ar[j] ==k){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return null;
//    }


//    2 Way Two Pointer
    public static int[] UseBinaryApproach(int[] a,int k){


        int[] ar=Arrays.copyOf(a,a.length-1);
        Arrays.sort(ar);
        int left=ar[0];
        int right=ar.length-1;

//
        while(left < right){
            if(ar[left]+ar[right]==k){
                return new int[]{left,right};
            } else if (ar[left]+ar[right] < k) {
                left+=1;
            }else{
                right-=1;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        int[] ar={16,4,23,8,15,42,1,2};

        int target=12;
//        ;
       int[] indexes=UseBinaryApproach(ar,target);

       if(indexes!=null){
           System.out.println("["+indexes[0]+","+indexes[1]+"]");
       }else{
           System.out.println("Not any Number will give your TARGET..");
       }

    }
}
