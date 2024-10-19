package Array;

import java.math.BigInteger;

public class TwentyNine {

    //In big integer Multipy is method for multiplying an answer and there are serveral Method for that .
    private static BigInteger getfactorial(int n1) {

        //get BigInteger
        BigInteger fact=BigInteger.ONE;
//        Loop for getting factorial till n1
        for (int i = 2; i <= n1; i++) {
           fact=fact.multiply(BigInteger.valueOf(i));
        }

      return fact;
    }
    public static void main(String[] args) {
        //Find the  Factorial of Largest Number using BIGINTEGER class.
        //It is an Class present at math package .which used to perform operation on extremely large numbers.
        //it solve those question whose out of the range of primitive data types ok.
        // INT -> 32 bit e.g:-> 20! factorial is last limit.
        // Long -> 64 bit e.g:-> 170! factorial is last limit.

       int n=51;
        System.out.println("The factorial "+n+" is :--->>   "+getfactorial(n));

    }


}
