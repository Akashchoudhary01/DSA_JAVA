import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Size of array
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        // Array Creating
        int[] arr = new int[n];
        // initilize value to array
        System.out.print("Enter the  Elements of Array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // target Element
        System.out.print("Enter Target Element x: ");
        int x = sc.nextInt();
        // output

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x) {System.out.print("Element Found");}
            
        }
        System.out.print("Element Not Found ");
    }
    
}
