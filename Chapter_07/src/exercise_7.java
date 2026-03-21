interface USBRechargeable {
    void charge();
}
interface TypeCRechargeable {
    void charge();
}

class Car implements USBRechargeable, TypeCRechargeable {
    @Override
    public void charge() {
        System.out.println("两种方式都能充电捏");
    }
}

public class exercise_7 {
    public static void main(String[] args) {
        Car hq = new Car();
        hq.charge();
    }
}
