import java.util.Scanner;
import java.util.Random;
public class Main_43 {
    Scanner inp=new Scanner(System.in);
    Random rand=new Random();
    private int compNum;
    private int guess;
    private int ans;
    public Main_43(){
        compNum=rand.nextInt(101);
    }
    public void input(){
        System.out.println("Enter your guessed number:");
        ans=inp.nextInt();
    }
    public void correctAns() {
        while (ans != compNum) {
            if (ans == compNum)
                break;
            else if (ans > compNum) {
                System.out.println("You entered a greater number, try again");
                input();
                guess++;
            } else if (ans < compNum) {
                System.out.println("You entered a lower number, try again");
                input();
                guess++;
            }
            System.out.println("Correct answer");
        }
    }
    public void setGuess(){
        guess=0;
    }
    public int getGuess(){
        return guess;
    }
    public static void main(String[] args) {
        System.out.println("Let us start the game");
        Main_43 game=new Main_43();
        game.input();
        game.setGuess();
        game.correctAns();
        System.out.println("Number of guesses: "+game.getGuess());
    }
}
