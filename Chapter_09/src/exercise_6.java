import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            try {
                System.out.println("输入名字：");
                String name = sc.nextLine();
                System.out.println("输入年龄");
                int age = sc.nextInt();
                System.out.println("姓名：" + name + "\n年龄：" + age);

                flag = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Delay No More：你家年龄是小数咩");
            } finally {
                sc.reset();
            }
        }
    }
}
