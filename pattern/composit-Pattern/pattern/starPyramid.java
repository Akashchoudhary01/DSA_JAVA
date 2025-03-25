package pattern;

import java.util.Scanner;

public class starPyramid {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();
	      

//	        for (int i = 1; i <= n; i++) {
//	            for (int j = 1; j <= n-i; j++) {
//	            	System.out.print(" "+" ");
//	            }
//	               for (int j = 1; j <= 2*i-1; j++) {
//	            	   System.out.print("*" + " ");
//	            	   
//	               }
//	            
//	            System.out.println();
//	        }
	        
	        ///
	        ///2nd method
	        ///
	        int nsp = n-1;  // number of Spaces
	        int nst = 1;    // number of Stars
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <=nsp; j++) {
	            	System.out.print(" "+" ");
	            }
	               for (int j = 1; j <=nst; j++) {
	            	   System.out.print("*" + " ");
	            	   
	               }
	            
	            System.out.println();
	            nsp--;   //After every new line the number of spaces is decreasing and number of stars are increasing two times to form a pyramid structure
	            nst+=2;
	        }

	        
	        
	        sc.close(); // Close scanner outside the loop
	    }

}
