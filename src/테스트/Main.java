package 테스트;

public class Main {
    enum CoffeeType {
        AMERICANO,
        ESPRESSO,
        LATTE,
        COLDBREW
    };

    public static void main(String[] args) {
        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);
        }

    }
}
