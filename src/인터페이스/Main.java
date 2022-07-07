package 인터페이스;
import java.util.Scanner;

interface NetworkAdapter {
    public abstract void connect();
    default void description() {
        System.out.println("자바8에서 추가된 새로운 메소드 입니다.");
    }
}

class Chat {
    Chat() {
    }
    public void sendMsg() {
        System.out.println("메시지를 보냅니다.");
    }
    public void rcvMsg() {
        System.out.println("메시지를 받습니다.");
    }
}

class LAN extends Chat implements NetworkAdapter {
    String company;
    String name;
    LAN(String company, String name) {
        this.company = company;
        this.name = name;
    }
//    void description() {
//        System.out.println("자바8에서 추가된 새로운 메소드 입니다.");
//    }

    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결 되었습니다.");
    }

    public void sendMsg() {
        System.out.println(name + "에게 메시지를 보냅니다.");
    }
    public void rcvMsg() {
        System.out.println(name + "으로 부터 메시지를 받습니다.");
    }
}

class WiFi implements NetworkAdapter {
    String company;
    String name;
    WiFi(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결 되었습니다.");
    }
    public void sendMsg() {
        System.out.println(name + "에게 메시지를 보냅니다.");
    }
    public void rcvMsg() {
        System.out.println(name + "으로 부터 메시지를 받습니다.");
    }
}

class LTE implements NetworkAdapter {
    String company;
    LTE(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LTE에 연결 되었습니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택 하세요[1]LAN, [2]WiFi, [3]LTE : ");
        int num = sc.nextInt();
        switch(num) {
            case 1 :
                adapter = new LAN("KT Magapass", "고유림");
                adapter.connect();
                ((LAN) adapter).sendMsg();
                ((LAN) adapter).rcvMsg();
                break;
            case 2 :
                adapter = new WiFi("SK Telecom", "나희도");
                adapter.connect();
                ((WiFi) adapter).sendMsg();
                ((WiFi) adapter).rcvMsg();
                break;
            case 3 :
                adapter = new LTE("LG U+");
                adapter.connect();
                break;
            default :
                System.out.println("네트워크 선택이 잘 못 되었습니다.");
        }
    }
}
