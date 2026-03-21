interface Addable {
    public void add();
}
interface Reducible {
    public void reduce();
}

interface Changeable extends Addable, Reducible {
    final int Units = 30;
}

class Number implements Changeable {
    int number;

    public Number() {
        number = 0;
    }

    @Override
    public void add() {
        number += Units;
        showNumber();
    }

    @Override
    public  void reduce() {
        number -= 30;
        showNumber();
    }

    public void showNumber() {
        System.out.println("景区现在有：" + number + "人捏");
    }
}

public class exercise_8 {
    public static void main(String[] args) {
        Number site = new Number();

        for (int i = 0; i < 7; i++) {
            site.add();
        }

        for (int i = 0; i < 4; i++) {
            site.reduce();
        }
    }
}
