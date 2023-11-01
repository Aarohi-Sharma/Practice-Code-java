import java.util.Scanner;
public class Main_19 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("marks of subject 1:");
        int m1=in.nextInt();
        System.out.println("marks of subject 2:");
        int m2=in.nextInt();
        System.out.println("marks of subject 3:");
        int m3=in.nextInt();
        float tot=(m1+m2+m3)/3.0f;
        if (m1>33 && m2>33 && m3>33 && tot>40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        System.out.println("Enter number of day:");
        int day=in.nextInt();
        switch (day){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wednesday");
            case 4-> System.out.println("thursday");
            case 5-> System.out.println("friday");
            default-> System.out.println("weekend");
        }
        System.out.println("Enter website:");
        String site=in.next();
        if (site.endsWith(".org")) {
            System.out.println("organizational");
        }
        else if (site.endsWith(".com")) {
            System.out.println("commercial");
        }
        else if (site.endsWith(".in")) {
            System.out.println("indian");
        }
    }
}
