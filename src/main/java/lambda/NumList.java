package lambda;

import java.util.ArrayList;

public class NumList {
   public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(5);
        number.add(10);
        number.add(50);
        number.forEach(n-> System.out.println(n));
    }
}