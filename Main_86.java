import java.util.Scanner;
public class Main_86 {
    public static void main(String[] args) {
        try{
            int a=69/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("haha");
        }
        catch(ArithmeticException e){
            System.out.println("hehe");
        }
        int marks[]=new int[5];
        marks[0]=45;
        marks[1]=54;
        marks[2]=67;
        marks[3]=49;
        marks[4]=23;
        Scanner in=new Scanner(System.in);
        boolean flag=true;
        int i=0;
        while(flag && i<5){
            try {
                System.out.println("Enter index value:");
                int ind = in.nextInt();
                System.out.println("value at index is " + marks[ind]);
                break;
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}
