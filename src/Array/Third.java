package Array;

import java.util.HashSet;

//Check if Pair is MATCHES with given SUM
public class Third {
//    Check sum with using Boolean function return true or false.

    // 1. First Brute Force O (n^2)
//    public static boolean checkSum(int[] ar,int x){
////        2 loop for i and i+1 that's why Complexity will be O(n^2)
//        for (int i =0; i <ar.length-1; i++) {
////
//            for (int j = i+1; j <ar.length ; j++) {
//
//                if(ar[i]+ar[j]==x){
//                    return true;
//                }
//            }
//        }
// return  false;
//    }

     // 2. Using HashSet us class derived from SET interface
//    steps  check Complements  is present in set or not , add  it into given array
    public boolean checkSum(int[] ar,int s){
        HashSet<Integer> set=new HashSet<>();

//        itrate on ARRAY, Find Complements
        for (int i = 0; i < ar.length; i++) {
            int comp=s-ar[i];

//            check is present in set or not
            if(set.contains(comp)){
                System.out.println(" "+ar[i]+","+comp);
            return  true;

            }
            //add current to set
            set.add(ar[i]);

        }
        return false;
    }
    public static void main(String[] args) {
// For Accessing non-static method using Ref of class name
        int[] myArr={0,-1,2,-3,1};
        int x=-5;
       Third third=new Third();

        //for print not present sum
        if(!third.checkSum(myArr,x)){
            System.out.println("Not Present in array.");
        }else {
            System.out.println("Yes Present ");
        }
    }
}
