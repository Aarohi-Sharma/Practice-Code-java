class MyThread7 extends Thread{
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("hey");
            i++;
        }
    }
}
class MyThread8 extends Thread{
    public void run(){
        int i = 0;
        while (i < 50) {
            System.out.println("heyyoo");
            i++;
        }
    }
}
public class Main_75 {
    public static void main(String[] args) {
        MyThread7 t1=new MyThread7();
        MyThread8 t2=new MyThread8();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
