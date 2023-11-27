import java.util.Scanner;
class MyExcep extends Exception{
    public String toString(){
        return super.toString()+"this is toString()";
    }
    public String getMessage(){
        return super.getMessage()+" This is getMessage()";
    }
}
public class Main_83 {
    public static void main(String[] args) {
        int a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        a=in.nextInt();
        if (a<99){
            try {
                throw new MyExcep();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
            System.out.println("end");
        }
        System.out.println("program end");
    }
}
