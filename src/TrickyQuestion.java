import java.lang.Math;
public class TrickyQuestion {
    public  int $;

    public static void main(String[] args) {
//        String str="hello";
//        System.out.println(str);
//        TrickyQuestion trickyQuestion=new TrickyQuestion();
//        System.out.println(trickyQuestion.$);
//        //It executes automatically without Error $ And _ is allowed
        //In get the deflaut values of given datatype int-0,float-0.0,chr-.,byte-0.. so on..


        char[] ca ={0x4e, '\u004e', 78};//Ox4e :-Hexa of N, '\u004e :- unicode of N, 78:-Ascii of N
        System.out.println((ca[0] == ca[1]) + " "+ (ca[0] == ca[2]));

        long longWithL = 1000*60*60*24*365L;
        long longWithoutL = 1000*60*60*34*365;
        System.out.println("Correct Result "+longWithL);  //It explicitly defined that we need long As '365L' ,i.e it will return correct output in LONG.
        System.out.println("Incorrect Result "+longWithoutL); //but in this case we don't defined any return type ,that's whygit is will be automatically calculated in INTEGER
        //For that Integer Overflow Occur's

//Before Initialized variable we can't use it further like string ,array
        String computerMove="";
        //Initializes as empty string
        switch ( (int)(3*Math.random()) )
        {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Scissors";
                break;
            case 2:
                computerMove = "Paper";
                break;
        }
        System.out.println("Computer's move is " + computerMove);


//After System.Exit no catch either finally block not be executed.
        try {
            System.out.println("Inside try block");
            System.exit(0);  // Program will exit here
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");  // This will NOT execute
        }

    }
}
