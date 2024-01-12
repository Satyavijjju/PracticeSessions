package annonymous.collections;

import java.util.List;
import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {
        //LIFO LAST IN FIRST OUT
        Stack<String> stack1 = new Stack<>();
       // stack1.add("hello");
        stack1.push("hello");
        stack1.push("geeks");
        stack1.pop();
       for(String n:stack1){
           System.out.println(n);
       }
    }
}
