package Array;

public class TwentySeventh {
    //We have to find an minimum Move in
    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum values in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int minMoves = Integer.MAX_VALUE;

        // Try each target between min and max
        for (int target = min; target <= max; target++) {
            int moves = 0;
            for (int num : nums) {
                moves += Math.abs(num - target);
            }
            minMoves = Math.min(minMoves, moves);
        }

        return minMoves;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(minMoves(nums));
    }


}
//Output: 2