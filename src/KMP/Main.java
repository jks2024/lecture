package KMP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
//        char[] chName = name.toCharArray();
//        for(int i = 0; i < chName.length; i++) {
//            if(chName[i] >= 'A' && chName[i] <= 'Z') System.out.print(chName[i]);
//        }
//        for(int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z')
//                System.out.print(name.charAt(i));
//        }
        for(int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
            }
        }
        System.out.println();
    }
}