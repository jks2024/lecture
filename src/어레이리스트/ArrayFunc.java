package 어레이리스트;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFunc {
    ArrayList<Integer> arrList = new ArrayList<>();
    ArrayList<Integer> oddList = new ArrayList<>();
    ArrayList<Integer> evenList = new ArrayList<>();

    void inputInt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        for(int i = 0; i < 7; i++) {
            arrList.add(sc.nextInt());
        }
    }
    void oddEven() {
        for (int e : arrList) {
            if (e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void dispOutput() {
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
        System.out.println();
    }
}
