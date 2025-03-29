import java.util.Scanner;

public class maxValueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Size of array
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        
        // Array Creation
        int[] arr = new int[n];
        
        // Initialize values in the array
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Initialize max to the first element
        int max = arr[0];
        
        // Find the maximum element in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Print the maximum value
        System.out.println("Maximum Value: " + max);
        
        sc.close();
    }
}
