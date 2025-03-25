package pattern;

import java.util.Scanner;

public class demoo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value of n: ");
		int n = sc.nextInt();
		int i , j ;
		int nsp = n-1;
		int nst = 1;
		for(i = 1; i<=n; i++) {
			for(j = 1; j<=nsp; j++) {
				System.out.print(" " + " ");
			}
			for(j=1; j<=nst; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			nsp--;
			nst+=2;
		}
		
		sc.close();
	}

}
