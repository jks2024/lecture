package 손익분기점;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int sellPrice = sc.nextInt();
        if (varCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
        while(true) {
            if(cnt > fixCost / (sellPrice - varCost)) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
