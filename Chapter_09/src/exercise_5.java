class MyException extends Exception {
  String message;

  public MyException(String ErrorMessage) {
      message = ErrorMessage;
  }

  public String getMessage() {
      return message;
  }
}

public class exercise_5 {
    public static void main(String[] args) {
        try {
            int a = 1, b = 0;
            if (b == 0)
                throw new MyException("sb吧，0不能做除数");
            int res = a / b;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
