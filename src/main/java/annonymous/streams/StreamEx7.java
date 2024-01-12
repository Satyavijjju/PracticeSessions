package annonymous.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//to sort list of strings
public class StreamEx7 {
    public static void main(String[] args) {
        List<String> sortName = Arrays.asList("apple","banana","pineapple","dragon","watermelon");
        List<String> sortedList=  sortName.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        }
    }
