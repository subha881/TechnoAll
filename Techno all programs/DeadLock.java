public class DeadLock {

    // These are the two resources
    private static final Object scanner = new Object();
    private static final Object printer = new Object();

    public static void main(String[] args) {

        // Thread 1 tries to lock scanner and then printer
        Thread thread1 = new Thread(() -> {
            synchronized (scanner) {
                System.out.println("Thread 1: Locked the Scanner");

                // Pause to ensure the other thread locks the printer first
                try { Thread.sleep(100); } 
                catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for Printer...");
                synchronized (printer) {
                    System.out.println("Thread 1: Locked the Printer");
                }
            }
        });

        // Thread 2 tries to lock printer and then scanner
        Thread thread2 = new Thread(() -> {
            synchronized (printer) {
                System.out.println("Thread 2: Locked the Printer");

                // Pause to ensure the other thread locks the scanner first
                try { Thread.sleep(100); } 
                catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for Scanner...");
                synchronized (scanner) {
                    System.out.println("Thread 2: Locked the Scanner");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}