package 매개변수의다형성;

public class DriveEx {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        driver.drive(bus);
        driver.drive(taxi);
    }
}