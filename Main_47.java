class EgClass{
    int a;
    EgClass(int a){
        this.a=a;
        System.out.println("parent");
    }
    public int getA(){
        return a;
    }
    public int returnone(){
        return 1;
    }
}
class Derived extends EgClass{
    Derived (int b){
        super(b);
        System.out.println("constructor");
    }
}
public class Main_47 {
    public static void main(String[] args) {
        EgClass e=new EgClass(5);
        Derived d=new Derived(65);
        System.out.println(e.getA());
    }
}
