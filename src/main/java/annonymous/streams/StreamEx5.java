package annonymous.streams;

import java.util.Arrays;
import java.util.List;

// java program to calculate sum of ood and even
public class StreamEx5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
       int even = nums.stream().filter(n->n%2==0).reduce(0,(c,e)->c+e);
        System.out.println(even);
        int odd = nums.stream().filter(n->n%2==1).reduce(0,(c,e)->c+e);
        System.out.println(odd);
    }
}
