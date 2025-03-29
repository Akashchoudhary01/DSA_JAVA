import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put("name", "Akash");
        hm1.put("age", 21);
        hm1.put(18, "Virat");
        hm1.put(45, "rohit");
        hm1.put(17, "pant");
        hm1.put(null, "Akash");
        hm1.put(null, null);
        System.out.println(hm1);
    }
    
}
