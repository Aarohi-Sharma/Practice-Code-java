import java.util.Scanner;
public class Main_18 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=in.nextInt();
        if (age>=60){
            System.out.println("senior citizen");
        }
        else if (age<60 && age>30){
            System.out.println("working");
        }
        else if (age<=30 && age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("child");
        }
        System.out.println("Enter your name:");
        String name=in.next();
        switch(name){
            case "riya":
                System.out.println("youngest daughter");
                break;
            case "priya":
                System.out.println("elder daughter");
                break;
            case "subh":
                System.out.println("only son");
                break;
            default:
                System.out.println("not our child");
        }
    }
}
