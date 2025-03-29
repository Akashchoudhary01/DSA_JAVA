// Method with no parameter but with a return value
class Calculator{
    int a;
    int b;
    int res;

    int add(){
        a = 29;
        b = 40;
        res = a+b;
        return res;
    }
}
public class typeB {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
       int sum =  calc.add();
       System.out.println(sum);
        
    }
    
}
