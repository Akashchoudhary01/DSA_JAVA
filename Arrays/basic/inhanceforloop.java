public class inhanceforloop {
    public static void main(String[] args) {
        int [][]nums = {
            {1, 2, 3 ,4},
            {2, 6, 7},
            {3, 4, 9 ,4}
        };
        for(int a[] : nums){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println(" ");
        }

    }
    
}
