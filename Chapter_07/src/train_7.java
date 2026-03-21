class Bird {
};

class Chicken extends Bird {
};

public class train_7 {
    public static void main(String[] args) {
        Chicken kun = new Chicken();
        System.out.println(kun instanceof Bird);
    }
}
