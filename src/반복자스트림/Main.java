package 반복자스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[]args) {
        // asList() : 일반 배열을 ArrayList 로 변경 한다.
        ArrayList<String> list = new ArrayList<>(Arrays.asList("고유림", "나희도", "백이진"));

        // Iterator 이용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println();

        // Stream 이용
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name)); // 람다식
    }
}
