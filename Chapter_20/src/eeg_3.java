import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Callable成功实现线程";
    }
}

public class eeg_3 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(new CallThread());
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println("获取线程返回值：\n" + futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
