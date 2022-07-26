package 게임만들기;
public class GameMain {
    public static void main(String[] args) {
        Character warrior = new Character("바리안린", 8, 2, 0.8, 0.5, 40, 400);
        Character wizard = new Character("제이나", 2, 30, 0.5, 0.9, 180, 250);
        ThreadA threadA = new ThreadA(warrior, wizard);
        ThreadB threadB = new ThreadB(warrior, wizard);
        threadA.start();
        threadB.start();
    }
}

