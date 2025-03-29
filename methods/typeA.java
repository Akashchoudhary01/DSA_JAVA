// Method With no parameter and no return value

class Calculator{
    int a;
    int b;
    int res;

    void add(){
        int a = 10;
        int b = 20;
        int res = a+b;
        System.out.println(res);
    }
}
public class typeA{
    public static void main(String[] args) {
        Calculator calc =  new Calculator();
        calc.add();
        
    }
}