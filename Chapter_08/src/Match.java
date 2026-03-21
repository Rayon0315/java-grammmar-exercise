interface Lightable {
    public void light();
}

public class Match {
    public static void main(String[] args) {
        new Match() {
            public void light() {
                System.out.println("点燃了捏");
            }
        }.light();
    }
}
