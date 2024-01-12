package annonymous.streams;

import java.util.HashSet;

//finding duplicates in stream
public class StreamEx1 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,5,6,6,8};
        HashSet<Integer>seen = new HashSet<>();
        HashSet<Integer>duplicate = new HashSet<>();
        for(int i :arr){
            if(!seen.add(i)){
                duplicate.add(i);
            }
        }
        System.out.println("duplicates" +duplicate);
    }
}
