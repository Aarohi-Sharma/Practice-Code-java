class MyThread6 extends Thread{
    public MyThread6(String name){
        super(name);
    }
    public void run(){
        System.out.println(this.getName());
    }
}
public class Main_74 {
    public static void main(String[] args) {
        MyThread6 t1=new MyThread6("H1");
        MyThread6 t2=new MyThread6("Y2");
        MyThread6 t3=new MyThread6("I3 (min imp)");
        MyThread6 t4=new MyThread6("O4");
        MyThread6 t5=new MyThread6("P5 (most imp)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
