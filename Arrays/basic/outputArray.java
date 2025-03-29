import java.util.Scanner;

public class outputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
       int  n = sc.nextInt();
        int arr[] = new int[n];
        // input Array
        for(int i = 0; i<=4 ; i++){
            System.out.print("Enter the value of array : ");
            arr[i] = sc.nextInt();
        }

    //   output Array
       for(int i = 0; i<arr.length; i++){

           System.out.print(arr[i]+ " ");
       }
       sc.close();
      
    }
}
