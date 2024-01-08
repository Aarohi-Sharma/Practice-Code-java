interface OuterInterface {
    void outerMethod();
    interface NestedInterface {
        void nestedMethod();
    }
}
public class Main_e3 implements OuterInterface.NestedInterface {
    public void nestedMethod() {
        System.out.println("Nested interface method implementation");
    }
    public static void main(String[] args) {
        Main_e3 myClass = new Main_e3();
        myClass.nestedMethod();
    }
}

