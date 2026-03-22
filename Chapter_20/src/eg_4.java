import java.awt.BorderLayout;
import javax.swing.*;

class JoinTest extends JFrame {
    private Thread threadA;
    private Thread threadB;

    private JProgressBar progressBarA = new JProgressBar();
    private JProgressBar progressBarB = new JProgressBar();

    public JoinTest() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 200, 100);

        getContentPane().add(progressBarA, BorderLayout.NORTH);
        getContentPane().add(progressBarB, BorderLayout.SOUTH);

        threadA = new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (true) {
                    progressBarA.setValue(++count);
                    try {
                        Thread.sleep(100);
                        threadB.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                while (true) {
                    progressBarB.setValue(++count);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (count == 100)
                        break;
                }
            }
        });
        threadB.start();
    }
}

public class eg_4 {
    public static void main(String[] args) {
        JoinTest test = new JoinTest();
        test.setVisible(true);
    }
}
