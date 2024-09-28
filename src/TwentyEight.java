import java.util.Arrays;

public class TwentyEight {
    public static int  Equal_Distri(int a[],int m,int n) {
        //1 sort your array
        Arrays.sort(a);
        //no chocolete and student 0
        if(m==0||n==0)
        {
            return 0;
        }
        //Asume maximum elemenent
        int Max_ele=Integer.MAX_VALUE;

        for(int i=0;i+m-1<=n;i++)
        {
            if(a[i+m-1]-a[i] < Max_ele)
            {
                Max_ele=a[i+m-1]-a[i];
            }
        }
        return Max_ele;

    }
    public static void main(String[] args) {
        int arr[]={3,4,1,9,56,7,9,12};
        int stu=5;
        int n=arr.length-1;
        System.out.println(Equal_Distri(arr,stu,n));
    }
}
// Output :-> 6
//Sorted array => {1,3,4,7,9,9,12,56}
// we  it will goes till  I+m-1  < length of array
// 1 iteration I+m-1 =>0+5-1=>4  , SuBARRAY WILL be 0 to 4, i=1 ++ => find differnce starting and last index values=> 9-1 => Max =8
//2 iteration  =>1+5-1=>5    ,SUBARRAY will be 1 to 5, i=2 ++ =>only we get max minimum here we got =>9-3=> max=6 updates
//3 iteration  =>2+5-1=>6 SUBARRAY will be 2 to 6, i=3 ++   => 12-4=8 but previous is less than so. ie not need to update max=6.
//4 iteration =>3+5-1=>7 SUBARRAY will be 3 to 7, i=4 ++  =>56-7=49 again we got max than previous so Final Answer Will be===>  6
//now 4+5-1=8 but length of the array will be 7 only .Exit From the loop