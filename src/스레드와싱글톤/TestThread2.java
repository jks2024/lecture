package 스레드와싱글톤;

public class TestThread2 extends Thread {
    Singleton singleton = Singleton.getSingleton();

    @Override
    public void run() {

        while(true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(singleton.id);
        }

    }
}
