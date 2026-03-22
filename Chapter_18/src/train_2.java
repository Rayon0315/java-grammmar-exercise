import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFramePart2 extends JFrame {
    public MyFramePart2(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                do_this_windowOpened(e);
            }
        });

        setTitle("根据桌面大小调整窗体大小");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
    }

    protected void do_this_windowOpened(WindowEvent e) {
        Toolkit toolkit = getToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) (screenSize.width * 0.8);
        int height = (int) (screenSize.height * 0.8);
        setSize(width, height);
    }
}

public class train_2 {
    public static void main(String[] args) {
        MyFramePart2 myFrame = new MyFramePart2();
        myFrame.setVisible(true);
    }
}
