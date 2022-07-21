package 스택;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[]args) {
        Stack<Character> st = new Stack<>(); // 제네릭 형태로 선언 함. 형 체크에 유리
        String expression = "((3+5*8-2))";
        System.out.println("expression : " + expression);
        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '(') {
                    st.push(ch);
                    //System.out.println("Push Call : " + ch);
                } else if (ch == ')') {
                    st.pop();
                    //System.out.println("Pop Call : " + st.pop());
                }
            }
            if (st.isEmpty()) {
                System.out.println("괄호가 일치 합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }
    }
}
