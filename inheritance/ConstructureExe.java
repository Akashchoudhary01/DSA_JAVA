//Constructor execution in case of Inheritance

class demo{

    int a , b;

    public  demo(){
        System.out.println("Parent Class Construcroe");
    }

    public  demo(int x , int y){
        System.out.println("Parent Class Paramaterized Construcroe");
        a = x;
        b = y;
    }
}

class demo1 extends demo{
    int m , n;

    
    public  demo1(){
        super(10  , 20);
        System.out.println("Child Class Construcroe");
    }

    public  demo1(int x , int y){
        System.out.println("Child Class Paramaterized Construcroe");
        m = x;
        n = y;
    }

}

public class ConstructureExe{
    public static void main(String[] args) {
        demo1 d = new demo1();
        // demo1 d1 = new demo1(10 , 20);
        // d1.demo();
    }
}

//this() method call the same class cosnstructor
//super() method call the Parent class cosnstructor