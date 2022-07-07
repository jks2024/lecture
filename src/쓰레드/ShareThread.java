package 쓰레드;

public class ShareThread {
    private int value = 0;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "의 Value 값은 " + this.value + "입니다.");
    }
}
