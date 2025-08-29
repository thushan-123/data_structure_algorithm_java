package tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(10);
        binaryTree.addNode(8);
        binaryTree.addNode(18);
        binaryTree.addNode(17);
        binaryTree.addNode(2);

        System.out.println("add data success");
        System.out.println(binaryTree.findNode(17));
    }
}
