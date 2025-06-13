package code;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            FactorialCalculator task = new FactorialCalculator(i);
            list.add(service.submit(task));
        }

        for (Future<Integer> future : list) {
            try {
                System.out.println("Result is: " + future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        service.shutdown();
    }

    static class FactorialCalculator implements Callable<Integer> {
        private final int number;

        public FactorialCalculator(int number) {
            this.number = number;
        }

        @Override
        public Integer call() throws Exception {
            Thread.sleep(2000);
            if (number <= 1) return 1;

            int result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}
