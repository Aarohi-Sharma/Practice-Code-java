public class Main_31 {
    int logic(int a, int b) {
        int c;
        if (a > b)
            c = a + b;
        else
            c = (a + b) * 5;
        return c;
    }
public static void main(String[] args) {
    int a=5, b=7;
    int c;
    Main_31 func= new Main_31();
    c=func.logic(a,b);
    System.out.println(c);
    int a1=14, b1=6;
    int c1=func.logic(a1,b1);
    System.out.println(c1);
    }
}

