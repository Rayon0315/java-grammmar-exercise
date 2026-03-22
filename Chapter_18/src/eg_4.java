import javax.swing.JOptionPane;

public class eg_4 {
    public static void main(String[] args) {
        int answer = JOptionPane.showConfirmDialog(
                null,
                "确定离开吗？",
                "芝士标题",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
    }
}
