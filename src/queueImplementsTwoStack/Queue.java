package queueImplementsTwoStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Queue {

    // declare the two stack : stack1 and stack2
    private final Stack<String> stack1 = new Stack<String>();
    private final Stack<String> stack2 = new Stack<String>();

    public boolean enqueue(String element){
        try{
            stack1.push(element);
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    public String dequeue(){
        if(stack2.empty()){
            int len = stack1.size();
            for(int i =0; i<len; i++){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }

    public List<String> queue(){
        List<String> list = new ArrayList<>();


        if(!stack2.empty()){
            int len = stack2.size();
            for(int i=0; i<len; i++){
                list.add(stack2.elementAt(i));
            }
        }

        if(!stack1.empty()){
            int len2 = stack1.size() -1;
            for (int i=len2; i>=0; i--){
                list.add(stack1.elementAt(i));
            }
        }

        return list;
    }
}
