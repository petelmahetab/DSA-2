package Array;

import java.util.Arrays;

public class Sixth {
//    Method for move 0'S TO right
    public  static  int[] moveRight(int[] ar,int n){

        int[] newArray=new int[n];
//        Traverse
        int index=0;
        for(int e:ar){
            if(e !=0){
                newArray[index++]=e;
            }
        }

//
//        while(index < ar.length-1){
//            newArray[index]=0;
//        }
        Arrays.sort(newArray);
        return newArray;
    }
    public static void main(String[] args) {
//        Move 0's To the end of the ARRAY.
        int[] ar={45,68,0,5,1,10,0,5,0,6,0};
        int n=ar.length-1;
        System.out.println(Arrays.toString(moveRight(ar,n)));

    }
}
