package 다형성;

public class PolyEx1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.out();
        System.out.println();

        Parent p = new Child(); // Overriding 된 parent 멤버이므로 접근 가능
        p.display();
        //((Child) p).out(); // Parent 타입으로 Child 멤버에 접근 할 수 없음
    }
}
