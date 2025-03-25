
package pattern;
import java.util.Scanner;

public class opptriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) 
                    System.out.print("* ");
                else  
                    System.out.print(" "); // Two spaces for alignment
            }
            System.out.println();
        }
        sc.close(); // Close scanner outside the loop
    }
}
