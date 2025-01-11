package TEST;

public class toggleString {
    public static void main(String[] args) {
    // We have string contain Uppercase alphabets then convert into vice versa
    //i/p:-> JcobMartin   o/p:->jCOBmARTIN

    String  str="JcobMartin";
    StringBuilder updatedString=new StringBuilder();


        for (char i:str.toCharArray()){
            //In Character, array we get the Lower to Upper case
            if(Character.isLowerCase(i)){
                updatedString.append(Character.toUpperCase(i));
            } //Upper to Lower Case
            else if (Character.isUpperCase(i)) {
                updatedString.append(Character.toLowerCase(i));
            }else {
                updatedString.append(i);
            }
        }
        System.out.println("Original String :-> "+str);
        System.out.println("Your Updated String :-> "+updatedString.toString());
    }
}
