class Outer3 {
    static class StaticInnerClass {
        void innerMethod() {
            System.out.println("Inside StaticInnerClass's innerMethod");
        }
    }
}
class ExtendedStaticInnerClass extends Outer3.StaticInnerClass {
    void extendedMethod() {
        System.out.println("Inside ExtendedStaticInnerClass's extendedMethod");
    }
}
public class Main_e7 {
    public static void main(String[] args) {
        ExtendedStaticInnerClass extendedInner = new ExtendedStaticInnerClass();
        extendedInner.innerMethod(); 
        extendedInner.extendedMethod();
    }
}
