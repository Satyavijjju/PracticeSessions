package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List1 {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
            ;
            ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(42);
        num.add(97);
        num.add(59);
        Collections.sort(num,com);
        num.forEach(n->System.out.println(n));


    }
    }
