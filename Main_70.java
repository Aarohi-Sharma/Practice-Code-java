class MyThread1 extends Thread{
    public void run() {
        int i=0;
        while (i<50) {
            System.out.println("my thread 1 runs");
            System.out.println("this is example");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run() {
        int i=0;
        while (i<50) {
            System.out.println("my thread 2 runs");
            System.out.println("this is second example");
            i++;
        }
    }
}
public class Main_70 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
