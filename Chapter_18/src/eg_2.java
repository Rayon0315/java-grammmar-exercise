import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJDialog extends JDialog {
    public MyJDialog(MyFrame frame) {
        super(frame, "芝士JDialog", true);
        Container container = getContentPane();
        container.add(new JLabel("对话框"));
        setBounds(120, 120, 100, 100);
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        Container container = getContentPane();
        container.setLayout(null);
        JButton button = new JButton("弹出对话框");
        button.setBounds(10, 10, 100, 21);;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJDialog dialog = new MyJDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });
        container.add(button);

        setSize(200, 200);;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class eg_2 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
