package 쓰레드;

public class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
