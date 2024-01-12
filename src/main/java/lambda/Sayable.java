package lambda;

 interface Sayable {
  public void say();
}
class Sayimpl implements  Sayable{

 @Override
 public void say() {
  System.out.println(" want to say hello");
 }
}
class Talk{
 public static void main(String[] args) {
  Sayimpl obj = new Sayimpl();
  obj.say();
 }
}


