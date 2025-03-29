import java.util.*;
public class hashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "Akash");   //{1 = "Akash"}
        ht.put(2, "virat");   //{2 = "virat"}
        ht.put(3, "Akash");   //{error}
        // ht.put(null, "Akash");   //{error}
        ht.putIfAbsent(4, "Ram ram laddar");

        // System.out.println(ht);

        //  //  //  //  Tree map

        Integer i = new Integer(6);


        TreeMap tm = new TreeMap();
        tm.put(2, "Rohit");
        tm.put(1, "virat");
        tm.put(3, "Dhoni");
        tm.put(4, "Dhavan");
        tm.put(i, "Akash");

        System.out.println(tm);
        // It return the Data in Assending Sorted order

        System.out.println(" ");
        // Hash Linked Map

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(2, "Akash");
        lhm.put(3, "Dhoni");
        lhm.put(4, "Dhavan");
        lhm.replace(i, tm, lhm);
        System.out.println(lhm);
    }
    
}
