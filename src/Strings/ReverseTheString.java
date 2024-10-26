package Strings;

public class ReverseTheString {
    public static void main(String[] args) {
        String str="the pen";
        int n=str.length();
        System.out.println(returnReverseString(str,n));
    }

    public static String returnReverseString(String str, int n) {
        //1.Splitting the Words
        String[] word=str.split(" ");
        int lengthOfWord=word.length;

        //2.Check length will be less than 3
        if (lengthOfWord < 2){
            return str;
        }
        //3.Join the string to answer
        String ans=word[1]+" "+word[0];
        //print the joined string using loop

        return ans;
     }
    //output:-> pen the
}
