class Number {
    int num;

    public Number(int num) {
        this.num = num;
    }

    public static Number add(Number x, Number y) {
        int res = x.num * y.num;
        return new Number(res);
    }
}

public class exercise_4 {
    public static void main(String[] args) throws Exception {
        try {
            Number A = new Number(12315);
            Number B = new Number(57876876);
            System.out.println(Number.add(A, B).num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
