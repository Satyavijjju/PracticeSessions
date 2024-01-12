package annonymous.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//avg of stream
public class StreamEx3 {
    public static void main(String[] args) {


        List<Integer> average = Arrays.asList(10, 20, 40, 70);
        OptionalDouble avg = average.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(avg);

    }
}