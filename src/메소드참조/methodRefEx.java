package 메소드참조;

import java.util.function.DoubleUnaryOperator;
public class methodRefEx {
    public static void main(String[]args) {
        DoubleUnaryOperator oper;
        oper = (n) -> Math.abs(n);  // 람다 표현식
        System.out.println(oper.applyAsDouble(-5));
        oper = Math::abs;
        System.out.println(oper.applyAsDouble(-5));
    }
}
