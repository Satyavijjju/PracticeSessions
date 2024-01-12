package annonymous;

abstract class Person {
    abstract void eat();
}
class TestAnonymousInner extends Person{

    @Override
    void eat() {
        System.out.println("nice fruits");
    }
}
class MainPerson{
    public static void main(String[] args) {
        TestAnonymousInner obj = new TestAnonymousInner();
        obj.eat();
    }

}