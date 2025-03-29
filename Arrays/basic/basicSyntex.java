// initialising indivisual array
public class basicSyntex {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 69;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 9;
        arr[4] = 4;
        System.out.println("The Value of 2nd element is "+arr[2]);
        
        //    update
        arr[2] = 32;
        arr[2] += 32;
        System.out.println("The Value of 2nd element is "+arr[0]);
        System.out.println("The Value of 2nd element is "+arr[2]);
    }
}
