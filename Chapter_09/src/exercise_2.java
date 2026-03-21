public class exercise_2 {
    public static void main(String[] args) {
        try {
            String str = "1.5";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
