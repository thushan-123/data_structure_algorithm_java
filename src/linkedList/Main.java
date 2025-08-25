package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedLists linkedLists = new LinkedLists();

        linkedLists.add("hii");
        linkedLists.add("helo");
        linkedLists.add("harry");
        linkedLists.add("ron1");
        linkedLists.add("ron2");
        linkedLists.add("ron3");

//        linkedLists.printAll();
//        System.out.println(linkedLists.searchIndex("ron"));
//        System.out.println(linkedLists.remove("hii"));
        //linkedLists.insert("potter", 0);
        linkedLists.delete(2);
        linkedLists.printAll();
    }
}
