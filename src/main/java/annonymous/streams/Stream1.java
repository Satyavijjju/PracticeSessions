package annonymous.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
       List<Integer> nums =  Arrays.asList(3,2,5,1,14);
     Integer  sum =  nums.stream().filter(n->n%2==1).map(n->n*2).reduce(0,(c,e)->c+e);
        System.out.println(sum);

    }
}
