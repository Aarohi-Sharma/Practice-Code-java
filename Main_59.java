interface Camera2{
    void takePhoto();
    void recordVideo();
    private void quality(){
        System.out.println("set quality");
    }
    default void takePortrait(){
        quality();
        System.out.println("click portrait");
    }
}
interface Wifi2{
    String[] getNetwork();
    void connect(String network);
    default void error(){
        System.out.println("no connection");
    }
}
class Cellphone2{
    void call(int number){
        System.out.println("calling "+number);
    }
    void pick(){
        System.out.println("connecting");
    }
}
class Smartphone2 extends Cellphone2 implements Wifi2, Camera2{
    public void takePhoto() {
        System.out.println("take picture");
    }
    public void recordVideo(){
        System.out.println("record video");
    }
    public String[] getNetwork(){
        System.out.println("setting network");
        String[] list={"airtel", "bsnl"};
        return list;
    }
    public void connect(String network) {
        System.out.println("connect to"+network);
    }
    public void error() {
        System.out.println("no internet");
    }
}
public class Main_59 {
    public static void main(String[] args) {
        Camera2 cam=new Smartphone2();
        cam.takePhoto();
        Smartphone2 s=new Smartphone2();
        s.call(98765457);
        s.error();
    }
}
