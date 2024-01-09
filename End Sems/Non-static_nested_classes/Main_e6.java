class Outer1 {
    class InnerClass {
        void innerMethod() {
            System.out.println("Inside InnerClass's innerMethod");
        }
    }
    class ExtendedInnerClass extends InnerClass {
        void extendedMethod() {
            System.out.println("Inside ExtendedInnerClass's extendedMethod");
        }
    }
}
public class Main_e6 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.ExtendedInnerClass extendedInner = outer.new ExtendedInnerClass();
        extendedInner.innerMethod(); 
        extendedInner.extendedMethod(); 
    }
}
