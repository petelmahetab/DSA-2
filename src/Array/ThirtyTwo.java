package Array;

public class ThirtyTwo {
    public static int Disp_Sqrt(int n)
    {
        int s=0,e=n;
        int mid=s+(e-s)/2;
        int ans=-1;
        //loop
        while( s<= e)
        {
            int sqrt=mid*mid;
            if(sqrt ==n)
            {
                System.out.println("The SquareRoot is "+mid);
            }
            //
            else if(sqrt <= n)
            {
                ans=mid;
                s=mid+1;
            }
            //
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int Find_Square=25;
        System.out.println(" "+Disp_Sqrt(Find_Square));
    }
}
