package Strings;
//finding first and last cha in string
public class StringEx2 {
    public static void main(String[] args) {
        String str ="hello good morning";
        int len = str.length();
        System.out.println(len);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(len-1));
    }
}
