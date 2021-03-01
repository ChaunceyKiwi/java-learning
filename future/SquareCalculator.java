import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {
    // private ExecutorService executor = Executors.newSingleThreadExecutor();
    private ExecutorService executor = Executors.newCachedThreadPool();

    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            System.out.println("Calculating square for: " + input);
            Thread.sleep(1000);
            return input * input;
        });
    }
}