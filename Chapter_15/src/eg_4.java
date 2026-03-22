import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class eg_4 {
    public static void main(String[] args) {
        File file = new File("F:\\MyProjects\\JavaFromTo\\textFile\\word.txt");

        try {
            FileWriter fw = new FileWriter(file);
            String word = "比比拉布，巴巴博弈。";
            fw.write(word);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            char[] ch = new char[1024];
            int len = fr.read(ch);
            System.out.println("文件中的信息是：" + new String(ch, 0, len));
            fr.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
