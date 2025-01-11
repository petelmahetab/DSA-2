package TEST;

import java.util.Scanner;

public class countVCOthersCharacters {
    public static void main(String[] args) {
        //We have return In given string how many Vowels,Consonants & OtherRemaining..
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String u want to finds Vowels ,Consonants and Remains...");
        String string=sc.nextLine();
    
        int vowels=0,consonants=0,other=0;
        string=string.toLowerCase();
        for (char i=0;i<=string.length()-1;i++){
         char chars=string.charAt(i);
           if("aeiou".indexOf(chars) !=-1){
               vowels++;
           } else if (Character.isLetter(chars)) {
               consonants++;
           }else{
               other++;
           }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(other);

    }
}
