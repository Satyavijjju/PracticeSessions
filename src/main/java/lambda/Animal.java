package lambda;

public interface Animal {
    public void sound();
    public void eat();

}
 class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("cat says meow");
    }

    @Override
    public void eat() {
        System.out.println("cat drinks milk");

    }
}
class AnimalClass{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
        Animal animal = new Cat();
        animal.eat();
        animal.sound();
        }
    }

