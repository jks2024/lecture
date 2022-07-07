package X보다작은수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arrList.add(sc.nextInt());
        }
        for(int e : arrList) {
            if(e < x) System.out.print(e + " ");
        }
        System.out.println();
    }
}
