package 메소드;

public class Main {
    public static void main(String[]args) {
        int result = sum(1,2,3,4,5);
        System.out.println(result);
    }

    static int sum(int ... values) {
        int sum = 0;
        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
