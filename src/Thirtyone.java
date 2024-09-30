public class Thirtyone {
    public static int Find_pivot(int ar[],int n,int k)
    {
        int Low=0;
        int High=n-1;
        //loop for run to N times
        while(Low <= High)
        {
            int mid=Low+(High-Low)/2;
            //If key present
            if(ar[mid]==k)
            {
                return mid;
            }

            //To check  Left part
            if(ar[mid] >=ar[Low])
            {
                //It return Key is at 1 part
                if(k >=ar[Low] && k<=ar[mid])
                {
                    High=mid-1;
                }
                else
                {
                    Low=mid+1;
                }
            }
            //To check Right wala Part
            else{
                if(k >=ar[Low] && k<=ar[mid])
                {
                    Low=mid+1;
                }
                else
                {
                    High=mid-1;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int Arr[]={8,10,17,1,3};
        int size=Arr.length-1;
        int key=1;
        System.out.println("The pivot of your array is:-  >  "+Find_pivot(Arr,Arr.length,1));

    }
}
