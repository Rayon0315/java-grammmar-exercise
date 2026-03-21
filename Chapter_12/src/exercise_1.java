import java.util.ArrayList;
import java.util.List;

public class exercise_1 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        for (char i = 'A'; i <= 'Z'; i++) {
            list.addLast(i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(Character.toLowerCase(list.get(i)));
        }
    }
}
