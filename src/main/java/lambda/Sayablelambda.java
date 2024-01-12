package lambda;

public interface Sayablelambda {
    public void say();


}
class Saylambda{
    public static void main(String[] args) {
     Sayablelambda obj =()->{
         System.out.println("nothing to say");

     };
        obj.say();
    }
}
