package annonymous;

 interface Person1 {
    public void eat();
    public void work();
}
class Anonymous {
    public static void main(String[] args) {
        Person1 obj1 = new Person1() {
            @Override
            public void eat() {
                System.out.println("nice fruits");
            }

            @Override
            public void work() {

            }
        };
        obj1.eat();

    }



}
