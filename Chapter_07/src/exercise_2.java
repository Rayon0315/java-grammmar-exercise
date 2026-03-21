interface Flyable {
    void fly();
}

abstract class Insect {
    protected int legs;

    public Insect(int legs) {
        this.legs = legs;
    }

    public abstract void reproduce();
}

class Fly extends Insect implements Flyable {
    public Fly() {
        super(6);

        System.out.println("苍蝇有" + legs + "条腿捏");
    }

    public void fly() {
        System.out.println("苍蝇能飞捏");
    }

    public void reproduce() {
        System.out.println("苍蝇产卵繁殖捏");
    }
}

public class exercise_2 {
    public static void main(String[] args) {
        Fly A = new Fly();

        A.fly();
        A.reproduce();
    }
}
