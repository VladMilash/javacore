package src.com.mvo.module1.part4.example3;


public class FooMain {
    public static void main(String[] args) {
        Foo foo = new Foo();

        Thread threadA = new Thread(foo::first);
        Thread threadB = new Thread(foo::second);
        Thread threadC = new Thread(foo::third);

        threadC.start();
        threadB.start();
        threadA.start();
    }
}
