package annonymous.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//covert list of string to uppercase
public class StreamEx4 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("satya","srihaas","vijay","reyansh");
      List<String> upper =  name.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);
    }
}
