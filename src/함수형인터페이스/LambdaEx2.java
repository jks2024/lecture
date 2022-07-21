package 함수형인터페이스;
@FunctionalInterface
interface Calc { // 함수형 인터페이스의 선언
    public int min(int x, int y);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        Calc minNum = (x, y)-> x < y ? x : y;
        System.out.println(minNum.min(3, 4));
    }
}
