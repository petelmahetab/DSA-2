import java.util.Arrays;

public class AggressiveCows {

//    Allocate Cows
    public static void main(String[] args) {
        int N=5;
        int Cows=3;
     int[] ar={1,2,8,4,9};
        System.out.println(allocatesCows(N,Cows,ar));
    }

    private static int allocatesCows(int n,int c,int[] a) {
        Arrays.sort(a);
        System.out.println(" After Sorted "+Arrays.toString(a));
        int ans=0;
        int start=a[0];int end=n-1;
        while(start <= end){
//
            int mid=start+(end-start)/2;
            if(isFound(a,n,c,mid)){
                ans=mid;
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return ans;
    }

    private static boolean isFound(int[] a, int n, int c, int maxAllowed) {
        int cow=1;
        int lastStall=a[0];

        for (int i = 0; i < n; i++) {
            if(a[i]-lastStall >=maxAllowed){
                cow++;
                lastStall=a[i];
            }

            if(cow==c){
                return  true;
            }
        }
        return false;

    }
}
