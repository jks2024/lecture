package 스레드와싱글톤;

public class ThreadSingleEx {
    public static void main(String[] args) {
        TestThread1 th1 = new TestThread1();
        TestThread2 th2 = new TestThread2();
        th1.start();
        th2.start();
    }
}
