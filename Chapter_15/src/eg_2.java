import java.io.File;

public class eg_2 {
    public static void main(String[] args) {
        File file = new File("F:\\MyProjects\\JavaFromTo\\textFile\\word.txt");
        if (file.exists()) {
            String name = file.getName();
            long length = file.length();
            boolean hidden = file.isHidden();

            System.out.println("文件名称是：" + name);
            System.out.println("文件长度是：" + length);
            System.out.println("文件是隐藏文件吗？" + hidden);
        } else {
            System.out.println("文件不存在");
        }
    }
}
