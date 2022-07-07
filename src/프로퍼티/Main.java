package 프로퍼티;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class Main {
    public static void main(String[]args) throws UnsupportedEncodingException {
        Properties properties = new Properties();
        String path = Main.class.getResource("config/database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);

    }
}
