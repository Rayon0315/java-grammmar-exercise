import java.util.Scanner;

public class exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入文件名(退出输入quit)：");
            String file = sc.nextLine();

            if (file.equals("quit")) {
                break;
            } else {
                System.out.println("是否MP4：" + file.endsWith("MP4"));
            }
        }
    }
}
