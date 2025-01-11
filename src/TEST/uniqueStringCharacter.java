package TEST;

import java.util.HashMap;

public class uniqueStringCharacter {
    public static void main(String[] args) {
        //We have to return unique String Character from the Given String.
        String str1="adbasfssd";

        //Use HashMap
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch: str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch:str1.toCharArray()){
            if(map.get(ch)==1){
                System.out.print(ch);
            }
        }

    }
}
