package exercise.concurrency;

import java.util.Random;
import java.util.concurrent.*;

public class Six {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallableTask task = new MyCallableTask();
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            Future<Integer> future = service.submit(new MyCallableTask());
            System.out.println(future.get());
        }
        service.shutdown();
    }
}

class MyCallableTask implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int nextInt = new Random().nextInt(10);
        TimeUnit.SECONDS.sleep(nextInt);
        return nextInt;
    }
}
