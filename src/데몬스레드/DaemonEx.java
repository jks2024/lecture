package 데몬스레드;

public class DaemonEx {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();
        Thread.sleep(3000);
    }
}
