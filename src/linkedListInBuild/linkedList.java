package linkedListInBuild;

import java.util.LinkedList;

public class linkedList {



    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        // use to stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");
//        linkedList.pop();
//        System.out.println(linkedList);

        // use to build queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.poll();

        linkedList.add(3,"H");
        linkedList.remove(0);
        linkedList.addFirst("K");
        linkedList.addLast("K");
        linkedList.remove("K");
        System.out.println(linkedList);
        System.out.println(linkedList.size());


    }
}
