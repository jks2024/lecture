package 영화표예매하기;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
            int selMenu = sc.nextInt();
            if(selMenu == 1) ticket.selectSeat();
            else {
                System.out.println(ticket.totalAmount());
                break;
            }
        }
    }
}
