import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输出字符串(退出输入哈基米)：");
            String inp = sc.nextLine();

            if (inp.equals("哈基米"))
                break;

            for (int i = inp.length() - 1; i >= 0; i--) {
                System.out.print(inp.charAt(i));
            }
            System.out.println();
        }
    }
}
