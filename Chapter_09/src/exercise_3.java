public class exercise_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i <= 4; i++) {
            try {
                System.out.println(arr[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
