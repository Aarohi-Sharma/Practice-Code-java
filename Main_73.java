class MyThread5 extends Thread{
    public MyThread5(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<25){
            System.out.println("Thread constructor");
            i++;
        }
    }
}
public class Main_73 {
    public static void main(String[] args) {
        MyThread5 t5=new MyThread5("Aaro");
        t5.start();
        System.out.println("Id of thread5 is " + t5.getId());
        System.out.println("name of thread5 is "+t5.getName());
        MyThread5 t6=new MyThread5("haru");
        t6.start();
        System.out.println("Id of thread6 is " + t6.getId());
        System.out.println("name of thread6 is "+t6.getName());
    }
}
