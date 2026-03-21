abstract class Shape {
    public abstract void calculateC();
}

class Triangle extends Shape {
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateC() {
        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("不能构成三角形捏");
            return;
        }

        int C = a + b + c;
        System.out.println("周长为：" + C);
    }
}

public class exercise_5 {
    public static void main(String[] args) {
        Triangle T1 = new Triangle(3, 4, 5);
        Triangle T2 = new Triangle(1, 4, 5);

        T1.calculateC();
        T2.calculateC();
    }

    private static class T21 {
    }
}
