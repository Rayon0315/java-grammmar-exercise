import java.io.File;

public class eg_1 {
    public static void main(String[] args) {
        File file = new File("F:\\MyProjects\\JavaFromTo\\textFile\\word.txt");
        if (file.exists()) {
            System.out.println("文件已删除");
        }

        try {
            file.createNewFile();
            System.out.println("文件已创建");;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
