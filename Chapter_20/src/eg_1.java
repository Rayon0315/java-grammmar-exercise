class ThreadTest extends Thread {
    String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(message + i + " ");
            try {
                ThreadTest.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class eg_1 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        t1.setMessage("Thread 1: ");
        t1.start();

        ThreadTest t2 = new ThreadTest();
        t2.setMessage("Thread 2: ");
        t2.start();
    }
}
