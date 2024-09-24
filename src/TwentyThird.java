public class TwentyThird {

    //steps: 1. Binary conversion variable go to Power and Result of the power.
   //2. ans=ans*baseValue If in binary we got 1 then we do these steps but when we got an 0 Nothing to change
    //3. Find the Square Of Base
    //4/ Loop will be log 2 n+1
    //5 if Binary form Negative then n=1/n and make negative binary to =-binRy
    //cases n=0 ,1.0. and x=0, 0.0 and x=1,1.0  and x==-1 aur power even==1.0 and x=-1 and power odd=-1.0;

    public static  double returnBinaryEXpontialion(double a,int n1){
        //cases
        if(n1==0) return 1.0;
        if(a==0) return 0.0;
        if(a==1) return 1.0;
        //If Negative base and power will be Even or odd
        if(a==-1 && n1%2==0) return 1.0;
        if(a==-1 && n1%2!=0) return -1.0;

        double result=1;
        long binaryForm=n1;
        // Power negative
        if(n1 < 0){
            a=1/a;
            //Making negative to positive
            binaryForm=-binaryForm;
        }
        while (binaryForm > 0){

            if(binaryForm%2==1){
                result*=a;
            }
            //square
            a*=a;
            //
            binaryForm/=2;
        }

        return result;
    }
    public static void main(String[] args) {
        //************BINARY EXPONENTIATION****************
        //We are going to solve an Buy and Stock problem with optimize //opproach .if 2^8 then we have convert power into its binary form
        // Loop will go lengh of binary format of power of number. instead 2^8 =2*2*2... so on. we have 2^8=2^1*2^1=>2^1;,2^2*2^2=>2^4;2^4*2*4=>2^8 Answer.
        double x=2.10000;
        int n=3;

        System.out.println(returnBinaryEXpontialion(x,n));

//output:
        //1020.0000
    }
}
