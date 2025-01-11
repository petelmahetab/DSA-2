package TEST;

import java.util.Scanner;

public class waveMatrix {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("How many Row's want..");
        int r=sc.nextInt();
        System.out.println("How many Col's want..");
        int c=sc.nextInt();

        System.out.println("Matrix Elements in Array");
        int[][] mat=new int[r][c];

         for(int i=0;i<r;i++){
             for (int j=0;j<c;j++){
                 mat[i][j]=sc.nextInt();
             }
         }
//Wave
        for(int i=0;i<c;i++){
            if(i%2==0) {
              for (int j=0;j<r;j++){
                  System.out.print(mat[j][i]);
              }
                System.out.println();
            }else{
                for(int j=r-1;j>0;j--){
                    System.out.print(mat[j][i]);
                }
                System.out.println();
            }
        }

    }
}