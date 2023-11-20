class MyThread3 implements Runnable{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("creating thread 1 using interface");
        }
    }
}
class MyThread4 implements Runnable{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("creating thread 2 using interface");
        }
    }
}
public class Main_71 {
    public static void main(String[] args) {
        MyThread3 t1=new MyThread3();
        Thread T1=new Thread(t1);
        MyThread4 t2=new MyThread4();
        Thread T2=new Thread(t2);
        T1.start();
        T2.start();
    }
}
