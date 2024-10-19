package Array;

public class Fifthteeth {
//Create an Function which solve this Problem
    public  static int returnPairsOfAB(int n,int a,int b){
        //1. Create an Variable which stores the Count of pair and End of the Function  we have to return it.
        int count=0;
        //2. condition Cube's are equals to give N.Find it. we Get Cubes
        int A3=a*a*a;
        int B3=b*b*b;
        //3. Check the sum of cubes is equals to N or not
        if(A3+B3 == n){
            //If valid then Increment the Count. Because we have pass condition.
            count++;
            //4. if we have same value of both A, B then sUm of Cub will same
            // A=3 ,B=3 then :- (A^3+B^3) = (B^3+A^3). but Values are differnt then We get different Sum
            if(a!=b) {
                count++;
            }
        }

        return count;
    }

public static void main(String[] args) {
    // We have problem called "CUB-SUM-PAIR" Means we have to find an how many pair we get after
    // CUBING of 2 number is equals to N.
    // A^3+B^3 === N :--> return How many pairs of (A,B) ,(B,A).. We return Pair when A and Value B is not equals
    //Given Data:->
     int N=39368;
     int A=1;
     int B=27;
    System.out.println("The Pair Are:--> "+returnPairsOfAB(N,A,B));
    // this we get 2 Matches N => Return 2


    int N1 = 91;
    int A1 = 3;
    int B1 = 4; // A = 3, B = 4
    System.out.println("The Pair Are:--> " + returnPairsOfAB(N1, A1, B1));
   // this will get 0 Matches N => return 0

}
}
