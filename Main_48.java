class A{
    public int a;
    public int meth1(){
        return 1;
    }
    public void meth2(){
        System.out.println("method 2 of a");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("method 2 of b");
    }
    public void meth3(){
        System.out.println("method 3 of b");
    }
}
public class Main_48 {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}
