package Strings;

import java.util.Objects;

//strings are immutable and we can define strings in two ways 1.using literals 2. using new keyword. Hree we define same value in 4 diffrent variables
public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "BeginnersBook";
        String str2 = "BeginnersBook";
        String str3 = new String("BeginnersBook");
        String str4 = new String("BeginnersBook");
        boolean b = (str1 ==str2)?true:false;
        boolean b2 = (str1.equals(str2))?true:false;
        System.out.println(b);
        System.out.println(b2);
        boolean b1 = (str3 ==str4)?true:false;
        boolean b4 = (str3.equals(str4))?true:false;
        System.out.println(b1);
        System.out.println(b4);
        int a = 5;
        int a1 = 5;

        if (a == a1) {
            System.out.println("References are the same");
        } else {
            System.out.println("References are different");
        }
        Integer x = 10;
        Integer y = 10;

        if (x == y) {
            System.out.println("References are the  x and y same");
        } else {
            System.out.println("References are x and y different");
        }





    }
}