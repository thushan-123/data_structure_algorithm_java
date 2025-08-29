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
                // right side node
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
        Node tmp = rootNode;

        while (tmp != null){

            if(tmp.data == value){
                return tmp.data;
            }
            // traverse left node or right node
            if(value > tmp.data){
                // right child
                tmp = tmp.leftChild;
            }else {
                // left child
                tmp = tmp.rightChild;
            }
        }
        return -1;
    }
}
