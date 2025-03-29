public class sumOfArrays{
    public static void main(String[] args) {
        int [] arr = { 2 , 3 ,4 ,6 , 43 , 22 , 11 , 33 , 99 , 69};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Total Sum: "+sum);
    }
}