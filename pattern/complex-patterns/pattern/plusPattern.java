package pattern;
import java.util.Scanner;
public class plusPattern {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of n: ");
		int n = sc.nextInt();
		int mid = n/2+1;
		int i , j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				if(i == mid || j == mid) {
					
				System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
