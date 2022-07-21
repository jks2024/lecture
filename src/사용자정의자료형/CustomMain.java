package 사용자정의자료형;

class NameCard {
    String name;
    int age;
    String addr;
    String eMail;
    String phoneNum;

    public NameCard(String name, int age, String addr, String eMail, String phoneNum) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
    }
}

public class CustomMain {
    public static void main(String[] args) {
       NameCard nameCard = new NameCard("우영우", 28, "서울시 강남구", "yyy@gmail.com", "010-5006-4146");
    }
}
