interface Camera{
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
interface Wifi{
    String[] getNetwork();
    void connect(String network);
    default void error(){
        System.out.println("no connection");
    }
}
class Cellphone{
    void call(int number){
        System.out.println("calling"+number);
    }
    void pick(){
        System.out.println("connecting");
    }
}
class Smartphone extends Cellphone implements Wifi, Camera{
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
public class Main_57 {
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        String[] ar=s.getNetwork();
        for(String item:ar){
            System.out.println(item);
        }
        s.takePortrait();
        s.error();
    }
}
