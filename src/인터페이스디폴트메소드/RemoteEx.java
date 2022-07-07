package 인터페이스디폴트메소드;
import java.util.Scanner;

public class RemoteEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택 하세요(1.TV/2.AUDIO) : ");
        int selType = sc.nextInt();
        RemoteControl rc;
        if(selType == 1) {
            rc = new Television();
            rc.turnOn();
            rc.setVolume(20);
            ((Television) rc).getInfo();
            rc.setMute(true);
            RemoteControl.changeBattery(); // 정적 메소드 호출
        } else {
            rc = new Audio();
            rc.turnOn();
            rc.setVolume(20);
            rc.setMute(true);
            ((Audio) rc).getInfo();
        }
    }
}
