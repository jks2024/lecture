package 대소문자변경;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();
        char[] word;
        word = input.toCharArray();
        for(int i = 0; i < word.length; i++) {
            if (word[i] < 'a') word[i] = (char)(word[i] + ('a' - 'A'));
            else word[i] = (char)(word[i] - ('a' - 'A'));
        }
        System.out.println(word);
    }
}
