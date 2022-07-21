package 스캐너연속;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        String[] city = {"", "서울", "경기", "인천", "수원"};
        Scanner sc = new Scanner(System.in);
        System.out.print("도시를 선택 하세요. [1]서울, [2]경기, [3]인천, [4]수원 : ");
        int num = sc.nextInt();
        System.out.println(city[num]);
    }
}
