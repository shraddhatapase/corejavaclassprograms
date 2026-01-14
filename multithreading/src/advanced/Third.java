package advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Third {

    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService exec = Executors.newFixedThreadPool(2);

        List<Future<String>> futures = new ArrayList<>();

        // 1️⃣ Submit all tasks first
        for (int i = 0; i < 10; i++) {
            Demo task = new Demo(i);
            Future<String> future = exec.submit(task);
            futures.add(future);
        }

        // 2️⃣ Get results later
        for (Future<String> f : futures) {
            System.out.println(f.get());
        }

        // 3️⃣ Shutdown executor
        exec.shutdown();
    }
}

class Demo implements Callable<String> {

    private int id;

    public Demo(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        System.out.println(
            Thread.currentThread().getName() + " executing task " + id
        );

        Thread.sleep(1000); // simulate work

        return "demo call " + id;
    }
}
