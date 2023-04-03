import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(10);
        for(int i = 0; i < 5; i++) {
            MyThread thread = new MyThread();
            executorService.execute(thread);
        }
        executorService.shutdown();
    }
}