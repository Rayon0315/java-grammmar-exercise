public class exercise_7 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 2)
                    throw new Exception("fuck you, no two");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                if (i == 2)
                    throw new Exception("fuck you, no two");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
