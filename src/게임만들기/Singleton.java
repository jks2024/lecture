package 게임만들기;

public class Singleton {
    static double damage;
    private static Singleton singleton = new Singleton();
    private Singleton() {
        damage = 0;
    }
    static Singleton getSingleton() {
        return singleton;
    }
}
