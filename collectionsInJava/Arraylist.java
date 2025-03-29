import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add("Akash");
        System.out.println(al1);
        
        ArrayList al2 = new ArrayList();
        al2.add("pw Skills");
        al2.add("Jai Shree Ram");
        al2.add(true);
        al2.add(69);
        System.out.println(al2);
        al2.add(6.9);
        System.out.println(al2);

        // al2.addAll(al1);
        al2.add(2, "ram ram");
        System.out.println(al2);
    }
    
}
