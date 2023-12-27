public class Multi19 {
    private static final String resource1 = "Resource 1";
    private static final String resource2 = "Resource 2";
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: Holding resource 1...");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1: Waiting for resource 2...");
                    synchronized (resource2) {
                        System.out.println("Thread 1: Acquired resource 2.");
                    }
                }
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: Holding resource 2...");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 2: Waiting for resource 1...");
                    synchronized (resource1) {
                        System.out.println("Thread 2: Acquired resource 1.");
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Both threads have completed.");
    }
}
