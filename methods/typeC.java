// Method with parameter and no return value

public class typeC {
    public static void main(String[] args) {
        Calculator cls = new Calculator();
        int a = 12;
        int b = 12;
        cls.multiply(a, b);  // Improved method name
    }
}

class Calculator {
    void multiply(int x, int y) {  // Improved method name
        System.out.println(x * y);  // Direct calculation, removed unnecessary variable
    }
}
