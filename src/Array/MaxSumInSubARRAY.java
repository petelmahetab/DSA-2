package Array;

public class MaxSumInSubARRAY {
    public static void main(String[] args) {
        //We have an array n number of elements .We have to calculate a sum of contiguous array which is MAXIMUM
        int[] nums={3,-4,5,4,-1,7,-8};
        int n=nums.length;

        //Brute force
//1 . Start 0 and end end length
//2 . start with Start
//3. returnMax sum using MAX function
        int maxSUm=Integer.MIN_VALUE;
        for (int st = 0; st < n; st++) {
            int sum=0;
            for (int en = st; en <n ; en++) {
//             we add sum with end only
//       Because previously added items is already present  in the array
           sum+=nums[en];

        maxSUm=Math.max(maxSUm,sum);
            }
        }
        System.out.println("The Maximum Sum of SUBARRAY is:->"+maxSUm);
    }
}

