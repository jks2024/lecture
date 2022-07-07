package 게임만들기;

import 싱글톤.Singleton;

public class GameMain {
    public static void main(String[] args) {
        Runnable character1 = new SecondTh("바리안린", 1, 10, 2, 0.8, 0.5, 450);
        Runnable character2 = new ThirdTh("제이나", 3, 2, 30, 0.5, 0.9, 200);
        Thread thread1 = new Thread(character1);
        Thread thread2 = new Thread(character2);
        thread1.start();
        thread2.start();
        Singleton single = Singleton.getSingleton();

    }
}

