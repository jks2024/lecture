package 제네릭;

class Person <T> {
    public T info;
    Person(T info) {
        this.info = info;
    }
}

public class Main {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("고유림");
        Person<Integer> p2 = new Person<>(1000);
        System.out.println(p1.info);
        System.out.println(p2.info);
    }
}
