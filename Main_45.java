class Base{
    int x;
    public void setX(int y){
        System.out.println("Setting x");
        x=y;
    }
    public int getX(){
        return x;
    }
    public void print(){
        System.out.println("hello");
    }
}
class Server extends Base{
    int y;
    public void setY(int z){
        y=z;
    }
    public int getY(){
        return y;
    }
}
public class Main_45 {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(4);
        System.out.println("X: "+b.getX());
        Server s=new Server();
        s.setX(5);
        System.out.println("Now x:"+s.getX());
    }
}
