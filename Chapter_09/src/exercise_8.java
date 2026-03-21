class Computer {
    public static int gcd(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Delay Nor More: No Negative Number!");
        }

        if (b > 0) {
            return gcd(b, a % b);
        } else {
            return a;
        }
    }
}

public class exercise_8 {
    public static void main(String[] args) {
        try {
            int A = -10, B = 20;
            System.out.println(Computer.gcd(A, B));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
