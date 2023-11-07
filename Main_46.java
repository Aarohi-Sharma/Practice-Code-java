class Base1{
    Base1(){
        System.out.println("constructor");
    }
    Base1(int a){
        System.out.println("overloaded constructor");
    }
}
class Server1 extends Base1{
    Server1(){
        super(0);
        System.out.println("derived constructor");
    }
    Server1(int x, int y){
        System.out.println("overloaded constructor of server");
    }
}
class Child extends Server1{
    Child(){
        System.out.println("child of server");
    }
    Child(int x, int y, int z){
        super(x,y);
        System.out.println("overloaded child of server");
    }
}
public class Main_46 {
    public static void main(String[] args) {
        Base1 b1=new Base1(9);
        System.out.print("\n");
        Server1 s1=new Server1(14, 8);
        System.out.print("\n");
        Child c=new Child();
        System.out.print("\n");
        Child d=new Child(12, 13, 17);
    }
}
