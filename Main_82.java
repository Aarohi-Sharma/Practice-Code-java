import java.util.Scanner;
public class Main_82 {
    public static void main(String[] args) {
        int marks[]=new int[5];
        marks[0]=45;
        marks[1]=54;
        marks[2]=67;
        marks[3]=49;
        marks[4]=23;
        Scanner in=new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("Enter array index:");
            int ind = in.nextInt();
            try {
                System.out.println("Hello, let us learn");
                try {
                    System.out.println(marks[ind]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index not exists");
                    System.out.println("Exception in level 2");
                }
            } 
            catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Ends");
    }
}
