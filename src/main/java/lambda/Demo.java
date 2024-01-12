package lambda;

import java.net.StandardSocketOptions;

 interface Demo {
    public void show();
}

 class DemoImpl implements Demo {

     public void show() {
         System.out.println(" show method");
     }
 }
     class Main {
         public static void main(String[] args) {
             DemoImpl demoimpl = new DemoImpl();
             demoimpl.show();
             Demo demo1 = new DemoImpl();
             demo1.show();
             Demo demo = new Demo() {
                 @Override
                 public void show() {
                     System.out.println("demo method");
                 }


             };
         }

 }