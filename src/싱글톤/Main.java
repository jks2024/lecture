package 싱글톤;

public class Main {
    public static void main(String[] args) {
        //Singleton obj1 = new Singleton();
        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();
        if(obj1 == obj2) {
            System.out.println("같은 싱글톤 객체 입니다.");
        } else {
            System.out.println("다른 싱글톤 객체 입니다.");
        }
        System.out.println(obj1.id);
        System.out.println(obj1.name);
        System.out.println(obj2.id);
        System.out.println(obj2.name);
        obj1.id = 1000;
        System.out.println(obj2.id);
    }
}
