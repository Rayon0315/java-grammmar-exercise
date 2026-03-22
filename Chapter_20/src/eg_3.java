import javax.swing.*;
import java.awt.*;
import java.util.Random;

class SleepMethodTest extends JFrame {
    private static Color[] color = {
            Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.LIGHT_GRAY,
            Color.ORANGE, Color.YELLOW, Color.RED, Color.PINK
    };

    private static final Random rand = new Random(114514);

    private static Color getColor() {
        return color[rand.nextInt(color.length)];
    }

    public SleepMethodTest() {
        Thread t = new Thread(new Runnable() {
            int x = 30, y = 50;

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Graphics graphics = getGraphics();
                    graphics.setColor(getColor());
                    graphics.drawLine(x, y, 100, y++);
                    if (y >= 80) y = 50;
                }
            }
        });

        t.start();
    }

    public static void init(JFrame frame, int width, int height) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}

public class eg_3 {
    public static void main(String[] args) {
        SleepMethodTest.init(new SleepMethodTest(), 100, 100);
    }
}
