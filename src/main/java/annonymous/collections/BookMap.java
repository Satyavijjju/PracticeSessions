package annonymous.collections;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.HashMap;
import java.util.Map;

public class BookMap {
    int id;
    String title;
    String Author;
    String Category;

    public BookMap(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        Author = author;
        Category = category;
    }
}
class BookMap1{
    public static void main(String[] args) {
        HashMap<Integer,BookMap> bookmap = new HashMap<>();
        BookMap b1 = new BookMap(1,"can i play","mowilliam","kids");
        BookMap b2 = new BookMap(3,"friends","mowilliam","kids");
        BookMap b3 = new BookMap(10,"bodyparts","seus","kids");
        bookmap.put(1,b1);
        bookmap.put(2,b2);
        bookmap.put(3,b3);
        for(Map.Entry<Integer,BookMap> entry: bookmap.entrySet()){
            int key = entry.getKey();
            BookMap b= entry.getValue();
            System.out.println(key+"Details");

            System.out.println(b.id+" "+b.title+" "+b.Author+" "+b.Category);
        }



    }
}
