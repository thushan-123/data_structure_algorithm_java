import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // stack is LIFO method (Last In First Out)
        // peek() -> return to top of element
        // pop() -> remove the top element
        // push() -> added to element in to top of stack
        // empty() -> return boolean value for stack is empty or not
        // search() -> search the element in stack return position / not element in stack return -1

        // USES OF STACK
        // undo/redo features in text editors
        // moving back/forward through browser history
        // calling function (call stack)
        // backtracking algorithm (maze , file directories)

        // initializes the stack

        Stack<String> stack = new Stack<String>();

        stack.push("book1");
        stack.push("book2");
        stack.push("book3");
        stack.push("book4");
        stack.push("book5");

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack Empty or Not: " + stack.empty());
        System.out.println("Elements: " + stack);
        System.out.println("Peek Element: " + stack.peek());
        System.out.println("Remove top element: " + stack.pop());
        System.out.println("Elements: " + stack);
        System.out.println("Search book3 element position: " + stack.search("book3"));
        System.out.println("Search book10 element in stack: " + stack.search("book10"));

    }
}