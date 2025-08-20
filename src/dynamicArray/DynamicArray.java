package dynamicArray;

public class DynamicArray {

    private int size;
    private int capacity = 10;
    Object[] array;

    public DynamicArray(){
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size>= capacity){
            grow();
        }
        array[size] = data;
        size++;

    }

    public void insert(int index, Object data){
        if(index >= capacity){
            grow();
        }
        // shift elements backward starting index
        for(int i= size; i>index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;

    }

    public void delete(Object data){
        for(int i =0;i<size; i++){
            if(array[i] == data){
                // elements shift the left side
                for(int k =i; k< (size-i-1); k++){
                    array[k] = array[k+1];
                }
                array[size-1] = null;
                size--;
                if(size <= (int) (capacity/3)){
                    reduce();
                }
            }
        }

    }

    public boolean isEmpty(){
        return size == 0;
    }

    private void grow(){
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for(int i=0; i< size; i++){
             newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void reduce(){
        int newCapacity = capacity /2;
        Object[] newArray = new Object[newCapacity];
        for(int i=0;i<size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public String toString(){
        String string = "";
        for(int i=0;i<size; i++){
            string += array[i] + ", ";
        }
        string = "[" + string.substring(0,string.length()-2) + "]";
        return string.toString();
    }
}
