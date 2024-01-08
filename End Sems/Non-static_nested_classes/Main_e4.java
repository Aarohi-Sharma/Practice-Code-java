class OuterClass {
    interface NestedInterface {
        void nestedMethod();
    }
}
class ImplementNestedInterface implements OuterClass.NestedInterface {
    public void nestedMethod() {
        System.out.println("Nested method implementation");
    }
}
public class Main_e4 {
    public static void main(String[] args) {
        ImplementNestedInterface instance = new ImplementNestedInterface();
        instance.nestedMethod();
    }
} 
