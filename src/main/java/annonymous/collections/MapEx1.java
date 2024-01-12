package annonymous.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"satya");
        map.put(2,"srihaas");
        map.put(9,"srihaas");
        map.put(3,"Reyansh");
        map.put(0,"vij");
        map.put(0,"vijju");
        map.put(0,"vijay");
        for(Map.Entry<Integer,String> m:map.entrySet()){
       // for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());

        }
    }
}
