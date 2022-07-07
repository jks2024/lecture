package 쓰레드안전종료;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        RunTread runTread = new RunTread();
        runTread.start();
        Thread.sleep(1000);
        runTread.setStop(true);
    }
}
