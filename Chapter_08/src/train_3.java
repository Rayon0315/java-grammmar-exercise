class Human {
    String name;
    Heart heart;

    public Human(String name) {
        this.name = name;
        heart = new Heart();
        System.out.println("这有个人捏，名字叫" + this.name);
    }

    class Heart {
        void beat() {
            System.out.println(Human.this.name + "的心在跳捏");
        }
    }

     void walk() {
        System.out.println(name + "在走路捏");
        heart.beat();
    }
}

public class train_3 {
    public static void main(String[] args) {
        Human ZS = new Human("张三");
        ZS.walk();
    }
}
