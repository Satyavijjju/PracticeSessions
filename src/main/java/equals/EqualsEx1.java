package equals;

import java.util.Objects;

public class EqualsEx1{
    public static void main(String[] args) {
        Laptop obj = new Laptop();

        obj.model="lenovo";
        obj.Memo=500;
        System.out.println(obj.method2());
        System.out.println(obj.model);
        Laptop obj1 = new Laptop();
        obj1.model="lenovo";
        obj1.Memo=500;
        System.out.println(obj1.model);
        System.out.println(obj1.Memo);
        boolean result = obj==obj1;
        System.out.println(result);
        boolean result1 = obj1.equals(obj);
        System.out.println(result1);

    }
}
class Laptop{
    String model;
    int Memo;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemo() {
        return Memo;
    }

    public void setMemo(int memo) {
        Memo = memo;
    }

    public String toString() {
        return "hello";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Memo == laptop.Memo && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, Memo);
    }

    public String method2(){
            return "method2";
        }
    }

