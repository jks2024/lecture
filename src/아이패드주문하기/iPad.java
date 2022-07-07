package 아이패드주문하기;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static 아이패드주문하기.Common.*;

public class iPad {
    int screen; // 화면 크기 :  11인치(1)와 12.9인치(2)
    int color;  // 컬러 : 스페이스그레이(1), 실버(2)
    int memory; // 용량 : 128GB(1), 256GB(2), 512GB(3), 1TB(4)
    int network; // 네트워크 : Wi-Fi(1), Wi-Fi + Cellular(2)
    String name; // 각인서비스로 이름
    String nowDate;
    String serial; // 제품의 고유 넘버
    static int cnt = 0; // 몇대 제작 되었는지 확인
    Scanner sc = new Scanner(System.in);
    iPad(String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        nowDate = sdf.format(now);
        cnt++;
        nowDate = nowDate + cnt;
    }
    // iPad Pro 구입 선택 메뉴
    boolean choicePad() {
        String isQuit;
        System.out.println("===== iPad Pro 구입하기 ====");
        System.out.print("계속 진행 하시려면 yes 를 입력 / 종료는 quit : ");
        isQuit = sc.nextLine();
        if(isQuit.equals("yes")) return true;
        else return false;
    }
    // 디스플레이 선택 기능
    void setScreen() {
        while(true) {
            System.out.print("디스플레이 선택 [1]11인치, [2]12.9인치 : ");
            screen = sc.nextInt();
            if(screen == 1 || screen == 2) break;
            System.out.println("디스플레이를 다시 선택 하세요.");
        }
    }
    // 컬러 선택 기능
    void setColor() {
        while(true) {
            System.out.print("컬러 선택 [1]스페이스그레이, [2]실버 : ");
            color = sc.nextInt();
            if(color == 1 || color == 2) break;
            System.out.println("컬러를 다시 선택 하세요.");
        }
    }
    // 용량 선택
    void setMemory() {
        while(true) {
            System.out.print("용량 선택 [1]128GB, [2]256GB, [3]512GB, [4]1TB : ");
            memory = sc.nextInt();
            if(memory > 0 && memory < 5) break;
            System.out.println("용량을 다시 선택 하세요 : ");
        }
    }
    // 네트워크 선택
    void setNetwork() {
        while(true) {
            System.out.print("네트워크 선택 [1]Wi-Fi, [2]Wi-Fi+Cellular : ");
            network = sc.nextInt();
            if(network == 1 || network == 2) break;
            System.out.println("네트워크를 다시 선택 하세요 : ");
        }
    }
    // 각인 서비스
    void setName() {
        while(true) {
            String service;
            System.out.print("각인 서비스를 신청 하시겠습니까?(yes/no) : ");
            service = sc.next();
            if(service.equals("yes")) {
                Scanner scName = new Scanner(System.in);
                System.out.print("이름을 입력 하세요 : ");
                name = scName.nextLine();
            } else {
                name = "iPad Pro";
            }
            break;
        }
    }
    // 시리얼 넘버 만들기
    void setSerial() {
        String scrStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serial = "iPad"+ scrStr + memStr[memory] + netStr + nowDate;
        System.out.println(serial);
    }
    // iPad 출고 하기
    void makeiPad() {
        System.out.println("\t<< iPad가 출고 되었습니다.>>");
        System.out.println("----------------------------------");
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련번호 : " + serial);
        System.out.println("----------------------------------");
    }
}