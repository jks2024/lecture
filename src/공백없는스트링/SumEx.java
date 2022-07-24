package 공백없는스트링;
import java.util.Scanner;

public class SumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sNum = sc.next();
        int sum = 0;
        for(int i = 0; i <sNum.length(); i++) {
            sum += sNum.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
