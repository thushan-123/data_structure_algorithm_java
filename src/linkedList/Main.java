package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedLists linkedLists = new LinkedLists();

        linkedLists.add("hii");
        linkedLists.add("helo");
        linkedLists.add("harry");
        linkedLists.add("ron");

        linkedLists.printAll();
        System.out.println(linkedLists.searchIndex("ron"));
        System.out.println(linkedLists.remove("hii"));
        linkedLists.printAll();
    }
}
