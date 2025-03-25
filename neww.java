import java.util.Scanner;
public class neww {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        if(isPalendrom(name)){
            System.out.println("True " + name+"'s Name is Pallendrom");
        }
        else
        {
            System.out.println("false, " + name +"'s Name is not Pallendrom"); 
            
        }
        sc.close();
        
    }
    public static boolean isPalendrom(String name){
        int left = 0;
        int right = name.length()-1;
    
        while (left < right) {
            if(name.charAt(left) != name.charAt(right)){
                return false;
            }
            left++;  
            right--;
        }
        return true;
    }
}

