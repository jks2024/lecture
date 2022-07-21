package 스트림필터링;

import java.util.stream.IntStream;

public class StreamFilterEx {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
        // 스트림에서 중복 요소를 제거함
        stream1.distinct().forEach(e->System.out.print(e + " "));
        System.out.println();
        // 스트림에서 홀수만 골라냄
        stream2.filter(n->n % 2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();
    }
}
