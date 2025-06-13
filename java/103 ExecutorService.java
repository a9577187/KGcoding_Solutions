package code;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Test {
	static class PrintNumbers implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("Number is %d%n", i);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
    	ExecutorService service = Executors.newSingleThreadExecutor();
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
    }
}