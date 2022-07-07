package 요소처리를위한람다식;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[]args) {
        List<Student> list = Arrays.asList(
                new Student("고유림", 89),
                new Student("나희도", 78)
        );
        Stream<Student> stream = list.stream(); // 스트림 얻기
        stream.forEach(s -> {
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name + "-" + score);
        });
    }
}
