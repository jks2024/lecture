package 아이패드주문하기;

public class Main {
    public static void main(String[]args) {
        iPad ipad = new iPad("iPad Pro");
        ipad.choicePad();
        ipad.setScreen();
        ipad.setColor();
        ipad.setMemory();
        ipad.setNetwork();
        ipad.setName();
        ipad.setSerial();
        ipad.makeiPad();
    }
}
