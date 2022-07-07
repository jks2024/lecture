package 트리맵찾기;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(87, "나희도");
        score.put(88, "고유림");
        score.put(75, "백이진");
        score.put(65, "구자경");
        score.put(98, "우영우");

        NavigableMap<Integer, String> descendingMap = score.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
        for(Map.Entry<Integer, String> entry : descendingEntrySet) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }
        System.out.println();

//        Map.Entry<Integer, String> entry = null;
//
//        entry = score.firstEntry();
//        System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
//
//        entry = score.lastEntry();
//        System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());
//
//        entry = score.lowerEntry(95);
//        System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
//
//        entry = score.higherEntry(95);
//        System.out.println("95점 위의 점수 : " + entry.getKey() + "-" + entry.getValue());
//
//        entry = score.floorEntry(95);
//        System.out.println("95점 이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
//
//        entry = score.ceilingEntry(95);
//        System.out.println("95점 이거나 바로 위의 점수 : " + entry.getKey() + "-" + entry.getValue());
//
//        while(!score.isEmpty()) {
//            entry = score.pollFirstEntry();
//            System.out.println(entry.getKey() + "-" + entry.getValue() + "남은 객체 수 : " + score.size());
//        }
    }
}
