public class Multi14 extends Thread {
    public void run() {
        System.out.println("Running...");
    }
    public static void main(String[] args) {
        Multi14 thread1 = new Multi14();
        Multi14 thread2 = new Multi14();
        System.out.println("Default thread priority of Thread 1: " + thread1.getPriority());
        System.out.println("Default thread priority of Thread 2: " + thread2.getPriority());
        thread1.setPriority(MAX_PRIORITY);
        thread2.setPriority(MIN_PRIORITY);
        System.out.println("The maximum thread priority of Thread 1 is: " + thread1.getPriority());
        System.out.println("The minimum thread priority of Thread 2 is: " + thread2.getPriority());
        System.out.println("" + Thread.currentThread().getName());
        System.out.println("Default thread priority of Main Thread: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(MAX_PRIORITY); 
        System.out.println("The maximum thread priority of Main Thread is: " + Thread.currentThread().getPriority());
    }
}
