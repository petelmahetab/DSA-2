package Strings;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entr string");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str)?"yes":"no");
    }

    public static boolean isPalindrome(String str) {
        int start=0;
   int last=str.length()-1;
   while(start <= last){
       if(str.charAt(start)!=str.charAt(last)){
       return false;}
       start++;
       last--;
   }
        return true;
    }

}
