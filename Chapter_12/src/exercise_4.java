import java.util.HashMap;
import java.util.Scanner;

public class exercise_4 {
    public static void main(String[] args) {
        HashMap<String, String> characters = new HashMap<>();
        characters.put("呼保义", "宋江");
        characters.put("智多星", "吴用");
        characters.put("花和尚", "鲁智深");
        characters.put("哈基米", "曼波");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入绰号（退出输入我不行了）：");
            String call = sc.next();

            if (call.equals("我不行了"))
                break;

            System.out.println(characters.getOrDefault(call, "没这个人捏"));
        }
    }
}
