class RunnableDemo2 implements Runnable {
    public void run() {
        System.out.println("Running " + Thread.currentThread().getId());
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " exiting.");
    }
}
public class Multi10 {
    public static void main(String args[]) {
        RunnableDemo2 R1 = new RunnableDemo2( );
        Thread t1=new Thread(R1,"Thread 1");
        Thread t2=new Thread(R1,"Thread 2");
        Thread t3=new Thread(R1,"Thread 3");
        t1.run();
        t2.run();
        t3.run();
    }
}
