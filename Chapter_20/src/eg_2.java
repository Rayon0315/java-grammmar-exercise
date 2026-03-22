import java.awt.Container;
import javax.swing.*;

public class eg_2 extends JFrame{
    int count = 0;

    public eg_2() {
        setBounds(300, 200, 250, 100);
        Container container = getContentPane();
        container.setLayout(null);

        Icon icon = new ImageIcon("F:\\MyProjects\\JavaFromTo\\sourceFile\\1.gif");
        JLabel label = new JLabel(icon);
        label.setBounds(10, 10, 200, 50);
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    label.setBounds(count, 10, 200, 50);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    count += 4;
                    if (count >= 200) {
                        count = 10;
                    }
                }
            }
        };

        t.start();
        container.add(label);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new eg_2();
    }
}
