enum RainbowEnum {
    Red, Orange, Yellow, Green, SkyBlue, Blue, Purple
};

public class exercise_1 {
    public static void main(String[] args) {
        RainbowEnum[] colors = RainbowEnum.values();
        for (RainbowEnum color : colors) {
            System.out.println(color);
        }
    }
}
