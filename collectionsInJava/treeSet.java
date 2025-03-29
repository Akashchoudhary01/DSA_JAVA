import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(20);
        ts.add(40);
        ts.add(200);
        ts.add(160);
        ts.add(60);
        ts.add(170);

        System.out.println(ts);
        // it shorted data using binary search tree
        // in order triverser {LVR order}

        System.out.println(ts.higher(40));
        System.out.println(ts.lower(40));

        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));
    }
    
}
