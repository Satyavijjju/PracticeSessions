package annonymous.streams;

import java.util.ArrayList;
import java.util.List;

//calculate avg list of stream
public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> avg = new ArrayList<>();
        avg.add(10);
        avg.add(20);
        avg.add(30);
        avg.add(70);
       int i = avg.stream().reduce(0,(c,e)->c+e);
        System.out.println(i);
     int j =   avg.size();
        System.out.println(i/j);
    }
}
