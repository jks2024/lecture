package 알고리즘테스트;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t, a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("요리시간(초) : ");
        t = sc.nextInt();
        if(t % 10 != 0) System.out.println("-1");
        else {
            a = t / 300;
            b = t % 300 / 60;
            c = t % 300 % 60 / 10;
            System.out.printf("%d %d %d\n", a, b, c);
        }
    }
}
