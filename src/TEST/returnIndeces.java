package TEST;

import java.util.Scanner;

public class returnIndeces {
    public static void main(String[] args) {
        //We have Array with some elements with double return 1 and last index of that element.

        System.out.println("Enter size of Array u want..");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Array Elements..");
        int[] ar=new int[n];

        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
        }

        System.out.println("Enter element u want return index of that..");
        int target=sc.nextInt();

        int firstInx = -1,lastInx=-1;

        for (int j=0;j<=n;j++) {
            if (j == target) {
               if(firstInx==-1){
                   firstInx+=j;
               }
               lastInx+=j;
            }
        }


        if(firstInx !=-1){
            System.out.println("Found that..."+firstInx+" "+lastInx);
//            System.out.println();
        }else {
            System.out.println("Not Found...");
        }
    }
}
