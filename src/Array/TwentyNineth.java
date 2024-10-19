package Array;

public class TwentyNineth {
    //we have array and its key so need to check this key is present in array or not.
    //If present then return its INDEX else not present then return -1.
    public static int Get_index(int ar[],int t)
    {   int s=0,e=ar.length-1;
        //We are going to solve this approach using BINARY Search Because The complexity of this code will be
        while(s<=e)
        {
            // 1. Key present at middle.
            int mid=s+(e-s)/2;
            if(ar[mid]==t)
            {
                return mid;
            }
            //IF mid is greater than starting index
            else if(ar[mid] >=ar[s])
            {//
                if(t== ar[s] && ar[s] <=mid)
                {
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            //Mid is LESS than Starting index
            else
            {
                if(t==ar[mid+1] && ar[mid+1] <=ar[e])
                {
                    s=mid+1;
                }
                else
                {
                    e=mid-1;
                }

            }

        }
        return -1;
    }
    public static void main(String args[])
    {   int nums[]={1,35,8,4};
        int target=4;
        System.out.println(" "+Get_index(nums,target));
    }
}
