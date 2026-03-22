import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class eg_7 {
    public static void main(String[] args) {
        Book book1 = new Book("JAVA", 89.9);
        Book book2 = new Book("C++", 79.9);

        File fileObject = new File("F:\\MyProjects\\JavaFromTo\\textFile\\book.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileObject))) {
            oos.writeObject(book1);
            oos.writeObject(book2);

            System.out.println(book1);
            System.out.println(book2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
