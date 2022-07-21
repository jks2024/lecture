package 사용자정의예외클래스;

public class ExMain {
    public static void main(String[]args) {
        CheckEven ce = new CheckEven();
        int number1 = 100;
        int number2 = 99;
        try{
            System.out.println(ce.printEven(number1));
            System.out.println(ce.printEven(number2));
        } catch (EvenException e) {
            e.printStackTrace();
        }
    }
}
