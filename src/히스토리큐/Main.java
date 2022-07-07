package 히스토리큐;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Queue<String> queue = new LinkedList<>();
    static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        System.out.println("help 를 입력하면 도움말을 볼 수 있습니다.");
        while(true) {
            System.out.print(">>");
            try {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();
                if("".equals(input)) continue;
                if(input.equalsIgnoreCase("q")) { // 대소문자 구분 안함
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여 줍니다.");
                    System.out.println("q/Q - 프로그램을 종료 합니다.");
                    System.out.println("history - 최근 입력한 명령어를 " + MAX_SIZE + "개 보여 줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    save(input);
                    LinkedList list = (LinkedList) queue;
                    for(int i=0;i<list.size();i++)
                        System.out.println((i+1)+"."+list.get(i));
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력 오류 입니다.");
            }
        }
    }
    public static void save(String input) {
        if(!"".equals(input)) queue.offer(input);
        if(queue.size() > MAX_SIZE) queue.remove();
    }
}
