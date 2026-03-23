import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import javax.swing.*;

public class MyClient extends JFrame {
    private PrintWriter writer;
    Socket socket;

    private JTextArea area = new JTextArea();
    private JTextField text = new JTextField();

    public MyClient() {
        setTitle("向服务器发送数据");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        JScrollPane scrollPane = new JScrollPane(area);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        container.add(text, "South");
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writer.println(text.getText().trim());
                area.append(text.getText() + "\n");
                text.setText("");
            }
        });
    }

    private void connect() {
        area.append("尝试连接\n");
        try {
            socket = new Socket("127.0.0.1", 8998);
            writer = new PrintWriter(socket.getOutputStream(), true);
            area.append("完成连接\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.setSize(200, 200);
        client.setVisible(true);
        client.connect();
    }
}
