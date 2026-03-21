public class exercise_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {
                for (int k = j; k <= 100; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) - Math.pow(k, 2) == 0) {
                        System.out.printf("%d^2 + %d^2 = %d^2\n", i, j, k);
                    }
                }
            }
        }
    }
}
