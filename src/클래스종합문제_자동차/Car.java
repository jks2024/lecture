package 클래스종합문제_자동차;
public class Car {
    int maxSpeed; // 최고속도
    int fuelEff;  // 연비
    int fuelTank;
    int seatNum;
    public Car() {
        maxSpeed = 120;
        fuelEff = 10;
        fuelTank = 30;
        seatNum = 4;
    }
}

class Sedan extends Car {
    boolean addFunction;
    String name;

    public Sedan(String name) {
        this.name = name;
        addFunction = false;
        fuelEff = 12;
        maxSpeed = 200;
        fuelTank = 45;
        seatNum = 4;
    }
    // 이동 비용 산정
    // 주행 거리 / 연비 * 가격 = 유류비
    int getMovingCost(int dist, int cnt) {
        return (dist / fuelEff * 2000) * cnt;
    }
    void getMovingCost(int dist, int cnt, boolean on) {
    }

    void getCount(int passengerNum) {
    }
    void getCount(int passengerNum, boolean on) {
    }
    void getInfo() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + maxSpeed);
        System.out.println("연료 탱크 : " + fuelTank);
        System.out.println("좌석 갯수 : " + seatNum);
        System.out.println("부가 기능 : " + addFunction);
    }
}

class SportCar extends Car {

}



