abstract class Animal {
    public abstract void eat();
}

public class train_4 {
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("哈基米吃鱼");
            }
        };
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        };

        cat.eat();
        dog.eat();
    }
}
