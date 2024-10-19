package Array;

public class Sixteenth {

    //We use an 2 pointers With i,j
    // i fo starting 0 index and j will be 1+1
    // if i+j == k then return ar[i]
    // not equal then increase the i =0 to 1.
    public static  int[] returnIndexs(int[] a,int k){
        //set loop inner for i, j pointer
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                //i+j equal to k then return i
                if(a[i]+a[j] ==k){
                    // create new array return indexs
                   return new int[]{i,j};
//                    break;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {

        //Sum of Pairs We have an Array and target also. we need to find an sum is equals to the given target
        //And If Matches the Target Value then Return Indexes also
        int[] mineArray={1,6,8,6,9,4};
        int K=10;
int[] newArray=returnIndexs(mineArray,K);
//        System.out.println(" " +returnIndexs(mineArray,K));

        System.out.println(newArray!=null?"indexes are :-> "+newArray[0]+","+newArray[1]:"Not found");
    }
}
