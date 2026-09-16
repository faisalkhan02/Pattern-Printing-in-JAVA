package NewPattern;

import java.util.Scanner;

/*
  * * * * * *
   *       *
    *     *
     *   *
      * *
       *
      * *
     *   *
    *     *
   *       *
  * * * * * *
 */
public class P4_HollowHourglassPattern {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");

        int input = sc.nextInt();
        int end = input*2-1;


        for(int i=1;i<=end; i++){
            for(int j=1;j<=end;j++){
                if((i==1) || i== end || j==end+1-i || j ==i){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }
}
