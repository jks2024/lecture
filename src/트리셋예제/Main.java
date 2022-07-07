package 트리셋예제;

import java.util.TreeSet;

public class Main {
    public static void main(String[]args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] score = {78, 45, 60, 54, 92};
        for(int i = 0; i < score.length; i++) {
            treeSet.add(score[i]);
        }

        System.out.println("60점 이하 : " + treeSet.headSet(60));
        System.out.println("60점 이상 : " + treeSet.tailSet(60));

        // 주어진 점수 보다 바로 아래 점수
        System.out.println("60점 이하 : " + treeSet.lower(60));
        // 주어진 점수 보다 바로 위의 점수
        System.out.println("60점 이상 : " + treeSet.higher(60));
    }
}
