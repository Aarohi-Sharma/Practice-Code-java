interface sample{
    void meth1();
    void meth2();
}
interface child extends sample{
    void meth3();
    void meth4();
}
class SampleClass implements child{
    public void meth3() {
        System.out.println("method 3");
    }
    public void meth4() {
        System.out.println("method 4");
    }
    public void meth1() {
        System.out.println("method 1");
    }
    public void meth2() {
        System.out.println("method 2");
    }
}
public class Main_58 {
    public static void main(String[] args) {
        SampleClass sam=new SampleClass();
        sam.meth1();
        sam.meth2();
        sam.meth3();
        sam.meth4();
    }
}
