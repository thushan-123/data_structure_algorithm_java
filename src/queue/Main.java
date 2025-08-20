package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Queue is used FIFO method (First In First Out)
        // Queue is linear data structure\
        // Collection designed of holding prior to processing

        //    add -> enqueue, offer()
        //    remove -> dequeue, poll()

        // USES OF QUEUE
        // 1. Keyboard Buffer (letters should appear on screen in the order they're pressed)
        // 2. Printer Queue (print jobs should be completed in order)
        // 3. Used in LinkedList, PriorityQueues, Breadth-first search

        Queue<String> queue = new LinkedList<String>();

        queue.offer("book1");
        queue.offer("book2");
        queue.offer("book3");
        queue.offer("book4");
        queue.offer("book5");

        System.out.println(queue);
        queue.poll();
        System.out.println("Remove element (dequeue): " + queue.poll());

        // we can use LinkedList method because Queue class extent in LinkedList parent class

        System.out.println("Queue isEmpty: " + queue.isEmpty());
        System.out.println("book4 is available inside Queue: " + queue.contains("book4"));

    }
}
