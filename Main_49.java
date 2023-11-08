class One{
    public void name(){
        System.out.println("hallo");
    }
    public void greet(){
        System.out.println("and welcome");
    }
}
class Two extends One{
    public void name(){
        System.out.println("hello");
    }
    public void meet(){
        System.out.println("meet");
    }
}
public class Main_49 {
    public static void main(String[] args) {
        One obj=new One();
        obj.name();
        Two obs=new Two();
        One obe= new Two();
        obe.greet();
        obe.name();
    }
}
