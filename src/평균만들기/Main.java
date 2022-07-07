package 평균만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double max = 0, avr = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] arr = new double[num];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            if(max < arr[i]) max = arr[i];
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / max * 100.0;
            avr += arr[i];
        }
        System.out.printf("%.2f\n", avr/num);
    }
}
