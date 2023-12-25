class RunnableDemo3 implements Runnable {
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
        for(int i = 4; i > 0; i--) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
    }
}
public class Multi11 {
    public static void main(String args[]) {
        RunnableDemo3 R1 = new RunnableDemo3( );
        Thread t1=new Thread(R1,"T1");
        Thread t2=new Thread(R1,"T2");
        Thread t3=new Thread(R1,"T3");
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}
        t2.start();
        t3.start();
    }
}
