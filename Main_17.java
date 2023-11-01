public class Main_17 {
    public static void main(String args[]) {
        boolean a = true, b = false;
        if (a && b)
            System.out.println("Both are true");
        else if (a || b)
            System.out.println("Only one is true");
        else
            System.out.println("None");
        System.out.println(!a);
        System.out.println(!b);
    }
}
