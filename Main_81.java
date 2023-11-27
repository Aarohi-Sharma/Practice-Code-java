import java.util.Scanner;
public class Main_81 {
    public static void main(String[] args) {
        int marks[]=new int[5];
        marks[0]=45;
        marks[1]=54;
        marks[2]=67;
        marks[3]=49;
        marks[4]=23;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter array index:");
        int ind= in.nextInt();
        System.out.println("Enter number to divide with:");
        int num= in.nextInt();
        try{
            System.out.println("The value at index is "+ marks[ind]);
            System.out.println("Array value/number is "+marks[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Exception occured");
            System.out.println(e);
        }
    }
}
