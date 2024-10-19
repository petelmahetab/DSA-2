package Array;

public class Fouth {
//    1 approach
    public  static int returnMaxProfit(int[] ar,int mn,int mx){
        mn=1;
        mx=0;
        //iterate in Array
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] < mn){
                mn=ar[i];
            }
            if(ar[i] > mx){
                mx=ar[i];
            }

        }
        System.out.println(mn);
        System.out.println(mx);
int pro=mx-mn;
        return pro;
    }
//Buy & Sell stock within given Weekly data.

    //2. using java 8 feature like Stream  for performing some operation ..But we can't get indexes of min & max
//
//    public static int returnMaxProfit(int[] ar,int min,int max)
//    {
//        max=Arrays.stream(ar).max().getAsInt();
//        min=Arrays.stream(ar).min().getAsInt();
//        int profit=max-min;
//
//        return profit;
//    }

    public static void main(String[] args) {
     int[] arr={3,5,1,7,4,9,3};
     int min=0;
     int max=0;
        System.out.println("Maximum Profit will be:--> "+returnMaxProfit(arr,min,max));
    }
}
