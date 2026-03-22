import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Price: " + this.price;
    }
}
