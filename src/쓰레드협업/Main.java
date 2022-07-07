package 쓰레드협업;

public class Main {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 고유 객체 생성
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}
