import java.util.Scanner;
public class Main_06 {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        float m1=in.nextFloat();
        System.out.println("Enter marks of subject 2:");
        float m2=in.nextFloat();
        System.out.println("Enter marks of subject 3:");
        float m3=in.nextFloat();
        System.out.println("Enter marks of subject 4:");
        float m4=in.nextFloat();
        System.out.println("Enter marks of subject 5:");
        float m5=in.nextFloat();
        float percent=((m1+m2+m3+m4+m5)/500)*100;
        System.out.println("Your percentage is "+percent);
    }
}
