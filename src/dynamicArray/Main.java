package dynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(4);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");

        dynamicArray.insert(4,"K");
        dynamicArray.delete("F");

        System.out.println(dynamicArray.toString());
        System.out.println();

    }
}
