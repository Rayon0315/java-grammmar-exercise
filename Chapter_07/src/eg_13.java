interface Paintable {
    public void draw();
}

class Quadrangle {
    public void doAnything() {
        System.out.println("四边形提供的方法");
    }
}

class Parallelogram extends Quadrangle implements Paintable {
    public void draw() {
        System.out.println("绘制平行四边形");
    }
}

class Square extends Quadrangle implements Paintable {
    public void draw() {
        System.out.println("绘制正方形");
    }
}

class Circular implements Paintable {
    public void draw() {
        System.out.println("绘制圆形");
    }
}

public class eg_13 {
    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        s.doAnything();

        Parallelogram p = new Parallelogram();
        p.draw();
        p.doAnything();

        Circular c = new Circular();
        c.draw();
    }
}
