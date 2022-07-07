package 자동차상속;

public class Main {
    public static void main(String[] args) {
        ElectricCar elCar = new ElectricCar("EV6");
        SportCar sportCar = new SportCar("Ferrari");
        elCar.setAutoDrv(true);
        sportCar.setTurbo(true);
        sportCar.breakPedal();
    }
}
