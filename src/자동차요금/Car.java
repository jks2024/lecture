package 자동차요금;

public class Car {
    int seatNum; // 좌석넘버
    int fuel;    // 연비
    int type;
    String style;
    Car(int type) { // 승용차에 생성자로 간주
        this.type = type;
        this.fuel = 12;
        this.style = "Normal";
    }
    Car(int type, String style) {
        this.type = type;

    }

}
