package NewPattern;

/*
Enter size: 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
import java.util.Scanner;

public class P2_newPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int print = 0;
        for(int i = 1;i<=2*n-1;i++){
            if(i<=n) print++;
            else print--;
            for (int j = 1; j <= print; j++) {
                        System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
