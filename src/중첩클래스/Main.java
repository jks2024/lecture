package 중첩클래스;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.bMethod();
    }
}

class A {
    public A() {
        System.out.println("A 객체가 생성됨.");
    }
    class B {
        public B() {
            System.out.println("B 객체가 생성됨.");
        }
        int bFiled1;
        //static int bFiled2;
        void bMethod() { }
    }
    static class C {
        public C() {
            System.out.println("C 객체가 생성됨");
        }
    }
}