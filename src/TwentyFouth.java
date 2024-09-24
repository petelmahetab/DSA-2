public class TwentyFouth {
    public  static int returnMxprof(int[] ar){
        int max=0;
        //we consider a bestBuy of the Day array [0]
        int bestBuy=ar[0];//1 is best day for Buying
        //Iterate and check next element mean for starting 1 index
        for (int i = 1; i < ar.length; i++) {
            //if current I hai woh greater hai BestBuy  then Find max
            // Max between max and current -bestBuy
            if(ar[i]>bestBuy) {
                max=Math.max(max,ar[i]-bestBuy);
            }
            // if not
            bestBuy=Math.min(bestBuy,ar[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        // STOCK BUY and SELL
        // We have to buy and stock in 1 day and sell that stock only future day not past days
        // We have to calculate an Maximum profit when i sell then stock .

        int[] prices={7,1,5,3,6,4};
        System.out.println(returnMxprof(prices));

        //output : 5
    }
}
