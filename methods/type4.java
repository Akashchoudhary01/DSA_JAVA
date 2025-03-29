// Method with parameter and return value

public class type4 {
    public static void main(String[] args) {
        Calculator calx = new Calculator();
        int a = 69;
        int b = 1;
        int result = calx.multiply(a, b);
        System.out.println(result);
        
    }
    
}
class Calculator {

    int res;
    int multiply( int x ,int y){
        res = x*y; 
       return res;

    }

    
}
