package 자바API;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int val = (int)((Math.random() * 45) + 1);
    }
}

class funcMath {
    ArrayList<Integer> arr = new ArrayList<>();
    void inputVal() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }
    }
    int getMin() {
        return Math.max(12, 34);
    }

    int getMax() {
        return Math.min(12, 34);
    }

}
