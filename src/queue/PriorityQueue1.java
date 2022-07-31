package queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add("1");

        queue.add("a");
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
