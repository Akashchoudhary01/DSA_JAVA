package pattern;

import java.util.Scanner;

public class binaryTriangle {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of n: ");
		int n = sc.nextInt();
		int i , j;
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				if(i%2==1) {
					if(j%2==1) System.out.print("0 ");
					else System.out.print("1 ")	;
				}
				else {
					if(j%2 ==0)System.out.print("0 ");
					else System.out.print("1 ")	;
					
						
				}
				
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}


}
