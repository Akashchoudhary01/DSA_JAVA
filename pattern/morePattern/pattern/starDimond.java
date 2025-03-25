package pattern;

import java.util.Scanner;

public class starDimond {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value of n: ");
		int n = sc.nextInt();
		int nsp = n-1;  //Number of spaces
		int nst = 1;  //Number of stars
		int i , j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=nsp; j++) {
				System.out.print(" "+ " ");
			}
			for(j=1; j<=nst; j++) {
				System.out.print("*"+ " ");
			}
			nsp--;
			nst+=2;
			System.out.println("");
		}
		//2nd part
		nsp = 1;
		nst = nst-4;
		for(i=1; i<=n; i++) {
			for(j=1; j<=nsp; j++) {
				System.out.print(" "+ " ");
			}
			for(j=5; j<=nst; j--) {
				System.out.print("*"+ " ");
			}
			nsp++;
			nst-=2;
			System.out.println("");
		}
		sc.close();
	}

}
