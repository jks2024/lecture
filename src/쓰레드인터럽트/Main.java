package 쓰레드인터럽트;

public class Main {
    public static void main(String[]args) {
        InterruptThread interThread = new InterruptThread();
        interThread.start();
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) { }
        interThread.interrupt();
    }
}
