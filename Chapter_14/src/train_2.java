interface Action {
    public void eat();
}

public class train_2 {
    public static void main(String[] args) {
        Action dogAction = () -> {
            System.out.println("狗吃骨头");
        };
        Action catAction = () -> {
            System.out.println("猫吃鱼");
        };
        Action chickenAction = () -> {
            System.out.println("鸡吃篮球");
        };

        dogAction.eat();
        catAction.eat();
        chickenAction.eat();
    }
}
