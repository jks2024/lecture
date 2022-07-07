package 멀티타입파라메터;

public class Main {
    public static void main(String[]args) {
        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("스마트 TV");
        pr1.setYear(2022);

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(12345);
        pr2.setYear("2022");
    }
}
