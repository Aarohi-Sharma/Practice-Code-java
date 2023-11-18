class C1{
  public int x=5;
    protected int y=45;
    int z=6;
    private int a=98;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class C2 extends C1{
    public void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class Main_66 {
    public static void main(String[] args) {
        C1 c=new C1();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        C2 b=new C2();
        b.meth2();
    }
}
