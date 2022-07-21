package 예외처리미루기;
import java.io.IOException;

public class TestThrows {
    public static void main(String[] args) {
        IOSample test = new IOSample( );
        try{
            test.input();
            test.output();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
