import java.awt.*;
import javax.swing.*;

public class eg_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("创建一个JFrame");
        Container container = frame.getContentPane();                  // 获取主窗口
        JLabel label = new JLabel("这是一个JFrame");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(label);
        frame.setSize(300, 150);
        frame.setLocation(320, 240);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭窗口停止程序
        frame.setVisible(true);
    }
}
