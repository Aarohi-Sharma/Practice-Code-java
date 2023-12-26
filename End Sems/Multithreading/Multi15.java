public class Multi15 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        Multi15 t1=new Multi15();//creating thread
        Multi15 t2=new Multi15();
        Multi15 t3=new Multi15();
        t1.setDaemon(true);//now t1 is daemon thread
        t1.start();//starting threads
        t2.start();
        t3.start();
    }
}
