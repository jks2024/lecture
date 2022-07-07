package 상속연습;

public class Main {
    public static void main(String[] args) {
        Worker work = new Worker();
        work.viewWorker();
        Student student = new Student();
        student.viewStudent();
        HouseWife houseWife = new HouseWife();
        houseWife.viewHouseWife();
    }
}
