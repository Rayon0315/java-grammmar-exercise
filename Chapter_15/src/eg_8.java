import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class eg_8 {
    public static void main(String[] args) {
        File fileObject = new File("F:\\MyProjects\\JavaFromTo\\textFile\\book.ser");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileObject))) {
            Book book1 = (Book) ois.readObject();
            Book book2 = (Book) ois.readObject();

            System.out.println(book1);
            System.out.println(book2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
