package 현재날짜;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String wordLine = sc.next();
        String[] names = wordLine.split("/");
        for(String name : names) System.out.println(name);
    }
}
