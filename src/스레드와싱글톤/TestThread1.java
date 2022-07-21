package 스레드와싱글톤;

public class TestThread1 extends Thread {
    Singleton singleton = Singleton.getSingleton();

    @Override
    public void run() {

        while(true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            singleton.id += 1;
        }
    }
}
