import javax.swing.*;

public class eg_3 {
    public static void main(String[] args) {
        Object[] o = { new JButton("是的"), new JButton("再想想") };
        Icon icon = new ImageIcon("F:\\MyProjects\\JavaFromTo\\sourceFile\\watchout.png");
        JOptionPane.showOptionDialog(
                null,
                "你准备好了吗？",
                "go go go出发咯！",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION,
                icon, o, null);
    }
}
