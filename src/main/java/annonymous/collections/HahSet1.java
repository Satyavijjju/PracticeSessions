package annonymous.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HahSet1 {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(10);
        hset.add(10);
        hset.add(30);
        Iterator<Integer>it = hset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
