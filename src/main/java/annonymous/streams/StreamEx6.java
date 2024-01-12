package annonymous.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx6 {
    public static void main(String[] args) {
        char startingLetter='s';
        List<String > sletter = Arrays.asList("satya","srihaas","vijay","reyansh");
       List<String> starting =sletter.stream().filter(s->s.startsWith(String.valueOf(startingLetter))).collect(Collectors.toList());
        System.out.println(starting);
    }
}
