import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(200);
        pq.add(300);
        pq.add(50);
        pq.add(10);
        // It short the elements using min-heap method
        System.out.println(pq);
    }
}
