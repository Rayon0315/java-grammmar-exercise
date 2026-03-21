public class exercise_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(arr[i]);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
