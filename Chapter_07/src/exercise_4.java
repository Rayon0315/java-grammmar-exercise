class Color {}
class Red extends Color {}
class Blue extends Color {}
class Yellow extends Color {}

public class exercise_4 {
    public static void judge(Color color) {
        if (color instanceof Red)
            System.out.print("红");
        if (color instanceof Blue)
            System.out.print("蓝");
        if (color instanceof Yellow)
            System.out.print("黄");
    }

    public static void main(String[] args) {
        Color[] colors = { new Red(), new Blue(), new Yellow() };

        for (int _i = 0; _i < 10; _i++) {
            for (int i = 0; i < 3; i++) {
                Color cur = colors[(int)(Math.random() * 3)];
                judge(cur);
            }
            System.out.println();
        }
    }
}
