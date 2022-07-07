package 인터페이스디폴트메소드;

public class Audio implements  RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
    // 재정의 해서 사용 할수 있다.
    public void setMute(boolean mute) {
        if(mute) System.out.println("Audio 무음 처리 합니다.");
        else System.out.println("Audio 무음 해제 합니다.");
    }

    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }
}
