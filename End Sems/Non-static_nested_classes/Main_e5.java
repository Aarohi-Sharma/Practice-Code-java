interface MyInterface {
    void myMethod();
    static class MyStaticClass {
        void staticMethod() {
            System.out.println("This is a static nested class method.");
        }
    }
}
public class Main_e5 {
    public static void main(String[] args) {
        MyInterface.MyStaticClass staticObj = new MyInterface.MyStaticClass();
        staticObj.staticMethod();
    }
}
