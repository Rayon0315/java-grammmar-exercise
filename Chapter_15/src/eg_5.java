import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class eg_5 {
    public static void main(String[] args) {
        String[] content = { "咕咕嘎嘎", "玛玛哈哈", "比比拉布" };
        File file = new File("F:\\MyProjects\\JavaFromTo\\textFile\\word.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int k = 0; k < content.length; k++) {
                bw.write(content[k]);;
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String tmp = null;
            int i = 1;
            while ((tmp = br.readLine()) != null) {
                System.out.println("第" + i + "行：" + tmp);
                i++;
            }

            br.close();;
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
