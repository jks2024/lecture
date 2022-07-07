package 열거타입;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch(week) {
            case 1 :
                today = Week.SUNDAY; break; // 열거 상수 대입
            case 2 :
                today = Week.MONDAY; break;
            case 3 :
                today = Week.TUESDAY; break;
            case 4 :
                today = Week.WEDNESDAY; break;
            case 5 :
                today = Week.THURSDAY; break;
            case 6 :
                today = Week.FRIDAY; break;
            case 7 :
                today = Week.SATURDAY; break;
        }
        System.out.println("오늘 요일 : " + today);
    }
}
