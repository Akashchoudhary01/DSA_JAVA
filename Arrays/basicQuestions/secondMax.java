public class secondMax {
    public static void main(String[] args) {
        int[]arr = { 2 , 3 ,4 ,5 , 6, 7, 8 , 33 , 69};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        int sMax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > sMax && arr[i]!=max) sMax = arr[i];
            {
               if(arr[i]!=max) 
               sMax = Math.max(sMax, arr[i]);
            }
        }

        System.out.print(max+ " ");
        System.out.print(sMax+ " ");
    }
    
}
