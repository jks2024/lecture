package 인터페이스디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME = 100; // 상수로 정의 하지 않았지만 상수 이다.
    int MIN_VOLUME = 0;
    // 추상 메소드 : abstract 를 생략 했지만 수창 메소드 이다.
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드 : jdk 1.8 이후로 추가 되었다.
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
}
