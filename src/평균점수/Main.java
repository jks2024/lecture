package 평균점수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] score = new int[5];
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        for(int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if(score[i] < 40) score[i] = 40;
            total += score[i];
        }
        System.out.println(total/5);
    }

}
