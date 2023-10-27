import java.util.Scanner;
public class Main_05 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a=input.nextInt();
        System.out.print("Enter an integer:");
        int b=input.nextInt();
        int c= a+b;
        System.out.println("Sum of numbers is "+c);
    }
}
