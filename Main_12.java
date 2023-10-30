import java.util.Scanner;
public class Main_12 {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        float a=7/4.0f*9/2.0f;
        System.out.println(a);
        char grade='b';
        grade=(char)(grade+8);
        System.out.println(grade);
        grade-=8;
        System.out.println(grade);
        System.out.println("Enter a number:");
        int c=in.nextInt();
        int b=67;
        System.out.println(c>b);
    }
}
