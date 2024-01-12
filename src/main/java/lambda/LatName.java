package lambda;

public interface LatName {
    public String firstName(String name);
}
class fullName {
    public static void main(String[] args) {
        LatName obj =(name)->{
           return "satya"+name;
        };
        obj.firstName("rai");
    }
}
