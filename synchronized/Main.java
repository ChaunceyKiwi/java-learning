
public class Main implements Runnable {

    public static int a, b;

    public static void main(String[] args) {
        a = 100;
        b = 100;

        // Check the total amount shared between a and b before the transfers
        System.out.println("Total before: " + (a + b));

        // Run threads which will transfer amounts between a and b
        Thread thread1 = new Thread(new Main());
        Thread thread2 = new Thread(new Main());
        thread1.start();
        thread2.start();

        // Wait for the threads to finish running
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check the total amount shared between a and b after the transfers
        // It should be the same amount as before
        System.out.println("Total after: " + (a + b));
    }

    public void run() {
        for (int i = 0; i < 10000000; i++) {
            transfer();
        }
    }

    // The synchronized keyword is a modifier that locks a method so that only
    // one thread can use it at a time. This prevents problems that arise from
    // race conditions between threads.
    public static synchronized void transfer() {
        // Choose a random amount to transfer
        int amount = (int) (5.0 * Math.random());

        // Transfer between a and b
        if (a > b) {
            a -= amount;
            b += amount;
        } else {
            a += amount;
            b -= amount;
        }
    }
}
