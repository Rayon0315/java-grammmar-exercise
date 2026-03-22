import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class eg_3 {
    public static void main(String[] args) {
        File file = new File("F:\\MyProjects\\JavaFromTo\\textFile\\word.txt");

        try {
            FileOutputStream out = new FileOutputStream(file);
            byte[] content = "哈基米南北路多。".getBytes();
            out.write(content);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream in = new FileInputStream(file);
            byte[] getContent = new byte[1024];
            int len = in.read(getContent);
            System.out.println("文件中信息为：" + new String(getContent, 0, len));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
