package 버블정렬;
public class Main {
    public static void main(String[] args) {
        int c;
        try {
            c = 4 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("종료 합니다.");
        }
    }
}