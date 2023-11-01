import java.util.Scanner;
import java.util.Random;
public class Main_20 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors:");
        int user=in.nextInt();
        int comp=rand.nextInt(3);
        System.out.println(comp);
        if (user==comp){
            System.out.println("draw");
        }
        else if (user==0 && comp==2 || user==1 && comp==0 || user==2 && comp==1) {
            System.out.println("you win");
        }
        else {
            System.out.println("computer wins");
        }
    }
}
