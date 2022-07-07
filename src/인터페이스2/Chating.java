package 인터페이스2;

public class Chating {
    NetworkAdapter adapter;
    Chating() {
    }
    public void sendMsg() {
        System.out.println("메시지를 보냅니다.");
    }
    public void rcvMsg() {
        System.out.println("메시지를 받습니다.");
    }
    interface NetworkAdapter {
        void connect();
    }
}

class LAN implements Chating.NetworkAdapter {
    String company;
    String name;
    LAN(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결 되었습니다.");
    }
}
class WiFi implements Chating.NetworkAdapter {
    String company;
    String name;
    WiFi(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi 연결 되었습니다.");
    }
}
class FiveG implements Chating.NetworkAdapter {
    String company;
    String name;
    FiveG(String company, String name) {
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company + " 5G 연결 되었습니다.");
    }
}