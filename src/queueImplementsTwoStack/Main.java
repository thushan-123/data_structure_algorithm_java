package queueImplementsTwoStack;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue("book1");
        queue.enqueue("book2");
        queue.enqueue("book3");
        queue.enqueue("book4");

        System.out.println(queue.queue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue("book5");
        System.out.println(queue.queue());
    }
}
