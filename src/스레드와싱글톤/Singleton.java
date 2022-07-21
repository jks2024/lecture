package 스레드와싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private Singleton() {
        name = "test";
        id = 100;
    }
    public static synchronized Singleton getSingleton() {
        return singleton;
    }
}