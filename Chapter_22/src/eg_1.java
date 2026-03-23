import java.net.*;

public class eg_1 {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            String localName = ip.getHostName();
            String localIp = ip.getHostAddress();

            System.out.println("本机名：" + localName);
            System.out.println("本机地址：" + localIp);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
