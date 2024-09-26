public class TwentyFifth {
    //Steps : First
    public static  int returnDecimal(int bi){
       //return DECIMAL as output
        int Deci=0;
        int power=1; //2^0==1

        //Loop Binary number greater than 0
        while(bi>0){
            int last_digit=bi%10;
            //Mutiply last digit to current power 2 and add it to result.
            Deci+=(last_digit*power);
            //Move to next binary element
            bi/=10;
            //upadate the power of 2 for next position.
            power*=2;//2^1,2^2,2^3..

        }
        System.out.println(power);
        return Deci;
    }
    public  static  int returnDecimalUsingBuiltIn(String bi){
        //Use ParseInt Approach for the converting this
        return Integer.parseInt(bi,2);
    }

    //Step: Decimal to Binary
    public static int returnBinary(int Deci){
        int Binary = 0;
        int power=1; //// 2^0=1

        //loop
        while(Deci >0){
            //Find last %2
            int lastElem=Deci%2;
            //add it binary
            Binary+=(lastElem*power);
            // divide by 2
            Deci/=2;
            power*=10;
        }
        return Binary;
    }
    public static int returnSumOFBinary(int Binary){
        int sum=0;
        //Iterate
        while (Binary > 0){
            //last digit
            int lstDigit=Binary%10;
            // add it sum
            sum+=lstDigit;
            //move
            Binary/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        //We have to convert BINARY to DECIMAL and DECIMAL to BINARY
//        System.out.println("Enter the Binary number.?");
        int Binary=1010;
        String BinaryNum="1111";

        int Decimal=15;
//        System.out.println("Traditional way :- "+returnDecimal(Binary));
////
//        System.out.println("ParseInt Method :- "+returnDecimalUsingBuiltIn(BinaryNum));
           int binary=returnBinary(Decimal);
           int retunSum=returnSumOFBinary(binary);
        System.out.println("Traditional way :-  "+binary);
        System.out.println("Sum is :-  "+retunSum);
           }
}

