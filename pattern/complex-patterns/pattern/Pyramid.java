package pattern;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of n: ");
		int n = sc.nextInt();
		int i , j;
		int a =1;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				if(i+j>n) System.out.print((char)(a++ +64)+" ");
		
				else  System.out.print(" ");
			}
			System.out.println();
	}
		sc.close();


	}

}
