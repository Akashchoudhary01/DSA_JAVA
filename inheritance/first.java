public class first {
    public static void main(String[] args) {
        Student sd = new Student();
        sd.rishu();
        sd.disp();
        System.out.println("Akash is the boss");
        
    }
    
}

class humen{

    void humen(){
        System.out.println("Humen Class Constructor");

    }
    int age;
    void rishu(){
        age = 21;
        System.out.println("Jai Shree Ram");
        System.out.println(age);
    }
}

class Student extends humen {
    void disp()
    {
        System.out.println("the age is : "+age);
    }

    
}
