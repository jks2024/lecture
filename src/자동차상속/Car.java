package 자동차상속;
// Car
// Sport Car : Turbo Mode
// Electric Car : 자율 주행 모드. 연료타입이 변경 되어야 함.
public class Car {
    int speed;
    int fuel;
    String color;
    String name;
    final void accelerator() {
        speed += 20;
        System.out.println("속도로 20KM 증가 시킵니다.");
    }
    final void breakPedal() {
        speed -= 20;
        System.out.println("속도를 20KM 감소 시킵니다.");
    }
}

class SportCar extends Car {
    boolean isTurbo;  // Turbo Mode가 켜지면 속도 20% Up
    SportCar(String name) {
        isTurbo = false;
        speed = 220;
        this.name = name;
    }

//    void breakPedal() {
//
//    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
}

class ElectricCar extends Car {
    boolean isAutoDrv;
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
    }

    public boolean isAutoDrv() {
        return isAutoDrv;
    }

    public void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
}