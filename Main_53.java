abstract class Base2 {
    public Base2() {
        System.out.println("constructor of base 2");
    }
    public void greet(){
        System.out.println("hello");
    }
    abstract public void meet();
    abstract public void meet2();
}
class Derived1 extends Base2{
    @Override
    public void meet(){
        System.out.println("welcome");
    }
    public void meet2(){
        System.out.println("afternoon");
    }
}
class Child1 extends Derived1{
    public void how(){
        System.out.println("good");
    }
}
abstract class Phone1{
    abstract void on();
}
class Smart extends Phone1{
    public void on(){
        System.out.println("On");
    }
}
public class Main_53 {
    public static void main(String[] args) {
        Derived1 c=new Derived1();
        c.meet();
        c.meet2();
        Phone1 obj=new Smart();
        obj.on();
    }
}
