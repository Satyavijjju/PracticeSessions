package creatafile;

import java.io.File;
import java.io.IOException;

public class fileEx1 {
    public static void main(String[] args) {
        try{
            File file = new File("newfile.txt");
            boolean fvar = file.createNewFile();
           if(fvar){
               System.out.println("file is created");
           }
           else{
               System.out.println("not created");
           }

        } catch (IOException e) {
            System.out.println("exception occurred");
            e.printStackTrace();
        }
    }
}
