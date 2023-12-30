public class Multi24 extends Thread{
    public void run(){
        for(int i=1;i<=2;i++){
            if(Thread.interrupted()){
                System.out.println("code for interrupted thread");
            }
            else{
                System.out.println("code for normal thread");
            }
        }
    }
    public static void main(String args[]){
        Multi24 t1=new Multi24();
        Multi24 t2=new Multi24();
        t1.start();
        t1.interrupt();
        t2.start();
    }
}
