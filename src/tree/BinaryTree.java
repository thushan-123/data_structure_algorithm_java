package tree;

public class BinaryTree {

    Node rootNode;

    public BinaryTree(){}

    public void addNode(int value){
        // first create new node
        Node newNode = new Node(value);

        // check root node is null
        if(rootNode == null){
            rootNode = newNode;
            return;
        }

        Node tmpNode = rootNode;
        while (true){

            if(tmpNode.data < value){
                // left side node
                if (tmpNode.leftChild == null){
                    tmpNode.leftChild = newNode;
                    break;
                }
                tmpNode = tmpNode.leftChild;
            }else{
                if(tmpNode.rightChild == null){
                    tmpNode.rightChild = newNode;
                    break;
                }
                tmpNode = tmpNode.rightChild;
            }
        }

    }

    public int  findNode (int value){

    }
}
