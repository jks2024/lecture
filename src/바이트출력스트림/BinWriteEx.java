package 바이트출력스트림;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BinWriteEx {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("test.db");
        byte a = 10;
        byte b = 20;
        byte c = 30;
        os.write(a);
        os.write(b);
        os.write(c);

        os.flush(); // 버퍼 비우기
        os.close();
    }
}
