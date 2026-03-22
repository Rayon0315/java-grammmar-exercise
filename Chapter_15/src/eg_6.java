import javax.xml.crypto.Data;
import java.io.*;

public class eg_6 {
    public static void main(String[] args) {
        File file = new File("F:\\MyProjects\\JavaFromTo\\textFile\\word.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("使用writeUTF()方法写入数据");
            dos.writeDouble(114.514);
            dos.writeInt(1919);
            dos.writeBoolean(true);

            dos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("readUTF: " + dis.readUTF());
            System.out.println("readDouble: " + dis.readDouble());
            System.out.println("readInt: " + dis.readInt());
            System.out.println("readBoolean: " + dis.readBoolean());

            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
