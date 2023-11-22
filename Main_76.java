class Prac1 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("good morning");
            i++;
        }
    }
}
class Prac2 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("welcome");
            i++;
        }
    }
}
public class Main_76 {
    public static void main(String[] args) {
        Prac1 p1=new Prac1();
        Prac2 p2=new Prac2();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
        p1.start();
        p2.start();
        System.out.println(p2.getState());
    }
}
