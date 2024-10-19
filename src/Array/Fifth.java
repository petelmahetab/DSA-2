package Array;

public class Fifth {
    public static int returnMax(int[] ar,int mn){
//
//        1. Only Maximum Elements
//         for(int e:ar){
//             if(e> mn){
//                 mn=e;
//             }
//         }
//        return mn;

//        2. Second Max
         int secMax=Integer.MIN_VALUE;
         for(int s:ar){
             if(s > mn){
                 secMax=mn;
                 mn=s;
             }
             else if(secMax < mn && s > secMax){
                 secMax=s;
             }
         }
         return secMax;
    }
    public static void main(String[] args) {
//        Find largest and secondLargest Element in array
        int[] ar={10,25,5,56,89,45};
        int seCmax=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
        System.out.println(returnMax(ar,seCmax));
    }
}
