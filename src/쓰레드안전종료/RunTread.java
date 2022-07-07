package 쓰레드안전종료;

public class RunTread extends Thread {
    private boolean stop; // stop 플래그 설정

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public void run() {
        while(!stop) {
            System.out.println("Thread 실행 중...");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
