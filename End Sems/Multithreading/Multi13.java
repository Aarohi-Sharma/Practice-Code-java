class RunnableDemo5 implements Runnable {
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
        for(int i = 1; i > 0; i--) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
    }
}
public class Multi13 {
    public static void main(String args[]) {
        RunnableDemo5 R1 = new RunnableDemo5();
        Thread t1=new Thread(R1);
        Thread t2=new Thread(R1);
        Thread t3=new Thread(R1);
        t1.setName("First T"); 
        t2.setName("Second T");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("First thread:"+t1.getName());
        System.out.println("Second thread:"+t2.getName());
        System.out.println("Third thread:"+t3.getName());
    }
}
