import java.util.ArrayList;

interface JudgePrime {
    public boolean judge(int x);
}

interface SingleNumberInterface {
    public ArrayList<Integer> getSingleNum(int max);
}

public class train_1 {
    public static void main(String[] args) {
        JudgePrime judger = (x) -> {
          if (x == 0 || x == 1) return false;
          for (int i = 2; i * i <= x; i++) {
              if (x % i == 0) {
                  return false;
              }
          }
          return true;
        };

        SingleNumberInterface getNumbers = (max) -> {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i <= max; i++) {
                if (judger.judge(i)) {
                    list.add(i);
                }
            }
            return list;
        };

        ArrayList<Integer> list = getNumbers.getSingleNum(100);
        for (int x : list) {
            System.out.println(x);
        }
    }
}
