import java.util.function.Function;

public class exercise_1 {
    Function<Long, Long> fac = (n) -> {
        long res = 1;
        for (long i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    };

    public static void main(String[] args) {
        exercise_1  ex = new exercise_1();
        for (long i = 1; i <= 10; i++) {
            System.out.println(i + "! = " + ex.fac.apply(i));
        }
    }
}
