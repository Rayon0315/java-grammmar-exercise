import java.util.Random;
import java.util.TreeSet;
import java.util.Iterator;

public class exercise_3 {
    public static void main(String[] args) {
        int len = 10;
        TreeSet<Integer> set = new TreeSet<>();
        Random random = new Random(114514);
        for (int i = 0; i < len; i++) {
            int neg = (random.nextInt() % 2 == 1) ? 1 : -1;
            int x = random.nextInt(100);
            while (set.contains(x * neg)) {
                neg = (random.nextInt() % 2 == 1) ? 1 : -1;
                x = random.nextInt(100);
            }
            set.add(x * neg);
        }
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            int x = iter.next();
            System.out.print(x + " ");
        }
    }
}
