package annonymous.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class List1 {
    public static void main(String[] args) {
        List<Integer> num1 = new LinkedList<>();
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(50);
        num1.remove(3);
        num1.forEach(n-> System.out.println(n));

    }
}
