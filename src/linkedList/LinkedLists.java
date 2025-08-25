package linkedList;

public class LinkedLists {

    // linkedList methods  add(), search(), remove(), printAll()

    // LinkedList stores 2 parts in Node (data , address)

    //
    //
    // Advantages : Dynamic data structure (allocate memory while run time)
    //              Easy to Insertion and Deletion  O(1)
    //              Low memory waste

    // Disadvantages : LinkedList slower than Arrays because LinkedList allocate memory different memory location
    //                 Arrays allocate the memory in nearest memory location, its elements can access fast


    private Node head = null;
    private Node tail = null;

    private int size = 0;

    public String add(String name){
        Node newNode = new Node(name);
        if(head == null && tail == null){
            // linkedList first element , create a new Node object
            newNode.next = null;
            head = newNode;
            tail = newNode;
            size +=1;

        }else{
            newNode.next =tail;
            tail=newNode;
            size +=1;

        }
        return name;
    }

    public void printAll(){
        System.out.println("LinkedList elements : ");
        if(head == null){
            System.out.println("no element in linkedList");
        }else{
            Node tmp = tail;
            while(tmp != null){
                System.out.println(tmp.name);
                tmp = tmp.next;
            }
        }
    }

    public int searchIndex(String name){
        if(head == null){
            // if linkList is empty , return the value -1
            return -1;
        }else{
            Node temp = tail;
            int i = 0;
            while(temp != null){
                if (temp.name.equals(name)){
                    return size -i -1;
                }
                temp = temp.next;
                i +=1;
            }
            return -1; // if element is not found return -1
        }
    }

    public int numOfElement(){
        return size;
    }

    public boolean remove(String name){
        if(tail.name.equals(name)){
            // this is last object  -> change tail.next
            tail = tail.next;
            return true;
        }else{
            // find the value
            int i = 0;
            Node tmp = tail;
            while (i < size){
                if(tmp.next.name.equals(name)){

                    // we should remove the next object (temp.next)
                    tmp.next = tmp.next.next;

                    return true;
                }else{
                    i +=1;
                    tmp = tmp.next;
                }
            }
        }
        return false;
    }

    public void insert(String name, int index){
        // first check for valid index
        if(numOfElement()  < index){
            throw new IndexOutOfBoundsException("index is outbound");
        }
        // create a new node
        Node newnode = new Node(name);
        newnode.next = null;
        Node t = tail;
        // move to the current index position
        for(int i =0; i!= size - index -1 ;i++){
            t = t.next;
        }
        newnode.next = t.next;
        t.next = newnode;

    }

    public void delete(int index){
//        if(size < index){
//            throw new IndexOutOfBoundsException();
//        }

        // check last index
        if(size -1 == index){
             //remove tail element
            Node t = tail;
            tail = t.next;
            return;
        }

        Node t = tail;
        for(int i=0; i != size- index -2; i++){
            t = t.next;
        }
        t.next = t.next.next;

    }



}
