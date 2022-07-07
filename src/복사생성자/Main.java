package 복사생성자;

public class Main {
    public static void main(String[] args) {
        Member mem1 = new Member("bear", "곰돌이사육사", "12345", 23, true);
        Member mem2 = mem1.getMember();
        mem2.age = 100;
        mem2.name = "test";

        System.out.println("name : " + mem1.name);
        System.out.println("name : " + mem2.name);

        System.out.println("name : " + mem1.age);
        System.out.println("name : " + mem2.age);


    }
}
