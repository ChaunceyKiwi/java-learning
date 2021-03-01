import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        SquareCalculator squareCalculator = new SquareCalculator();
        Future<Integer> future1 = squareCalculator.calculate(10);
        Future<Integer> future2 = squareCalculator.calculate(100);

        while (!future1.isDone() || !future2.isDone()) {
            System.out.println(
                    String.format(
                            "future1 is %s and future2 is %s",
                            future1.isDone() ? "done" : "not done",
                            future2.isDone() ? "done" : "not done"
                    )
            );

            Thread.sleep(300);
        }

        // Prints "Hello, World" to the terminal window.
        System.out.println("Result " + future1.get() + " " + future2.get());
    }

}