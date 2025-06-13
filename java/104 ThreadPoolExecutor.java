package code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            service.submit(new SleepTask());
        }

        service.shutdown();
    }

    static class SleepTask implements Runnable {
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            System.out.printf("Started with Thread: %s%n", current.getName());
            try {
                Thread.sleep(getRandom() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Ended with Thread: %s%n", current.getName());
        }

        private int getRandom() {
            return (int)(Math.random() * 5 + 1);
        }
    }
}
