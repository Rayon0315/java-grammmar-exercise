import javax.annotation.processing.SupportedSourceVersion;
import java.awt.Color;

class Cat {
    protected String name;
    protected int age;
    protected double weight;
    protected Color color;

    public Cat(String N, int A, double W, Color C) {
        name = N;
        age = A;
        weight = W;
        color = C;
    }

    public String toString() {
        String output = "\n";
        output += "名字：" + name + "\n";
        output += "年龄：" + age + "\n";
        output += "重量：" + weight + "\n";
        output += "颜色：" + color + "\n";
        return output;
    }
}
public class exercise_1 {
    public static void main(String[] args) {
        Color col1 = new Color(0, 0, 0);
        Cat id1 = new Cat("Java", 12, 21., col1);

        Color col2 = new Color(255, 255, 255);
        Cat id2 = new Cat("C++", 12, 21., col2);

        Color col3 = new Color(0, 0, 255);
        Cat id3 = new Cat("Python", 12, 21., col3);

        System.out.println("猫咪1号：" + id1);
        System.out.println("猫咪2号：" + id2);
        System.out.println("猫咪3号：" + id3);
    }
}
