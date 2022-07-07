package 해시맵;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class MenuInfo {
    String name;
    int price;
    String group;
    String desc;
    MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
}


public class Main {
    static HashMap<String, MenuInfo>map = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        makeMenu();
        selMenuList();

    }
    static void makeMenu() {
        map.put("Americano", new MenuInfo("Americano", 2000, "Coffee", "기본 커피 입니다."));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "진한 커피 입니다."));
        map.put("Latte", new MenuInfo("Latte", 4000, "Coffee", "우유가 포함된 커피 입니다."));
    }
    static void selMenuList() {
        String key;
        while(true) {
            System.out.println("메뉴를 선택 하세요.");
            System.out.println("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4]메뉴삭제, [5]종료 : ");
            int selMenu = sc.nextInt();
            switch(selMenu) {
                case 1 :
                   Set<String> keySet = map.keySet();
                   Iterator<String> keyIter = keySet.iterator();
                   while(keyIter.hasNext()) {
                       key = keyIter.next();
                       System.out.println("메뉴 : " + map.get(key).name);
                       System.out.println("가격 : " + map.get(key).price);
                       System.out.println("분류 : " + map.get(key).group);
                       System.out.println("설명 : " + map.get(key).desc);
                   }
                   break;
                case 2 :
                    System.out.print("조회 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).group);
                        System.out.println("설명 : " + map.get(key).desc);
                    } else System.out.println("조회 할 메뉴가 없습니다.");
                    break;
                case 3 :
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String grp = sc.next();
                        System.out.print("설명 입력 : ");
                        Scanner test = new Scanner(System.in);
                        String desc = test.nextLine();
                        map.put(key, new MenuInfo(key, price, grp, desc));
                    }
                    break;
                case 4 :
                    System.out.print("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)) {
                        map.remove(key);
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5 :
                    System.out.println("메뉴을 종료 합니다.");
                    return;
            }
        }
    }
}
