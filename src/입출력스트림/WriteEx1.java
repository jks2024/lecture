package 입출력스트림;
import java.io.*;

public class WriteEx1 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test2.db");
        byte[] buffer = new byte[5];
        int readByteNum = is.read(buffer, 2, 3);
        if(readByteNum != -1) {
            for(int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
