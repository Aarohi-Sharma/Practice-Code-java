package calc;
class Calculator{
    public void calculate(int x, int y){
        System.out.println("Result: "+(x+y));
    }
}
class ScCalculator{
    public void calculate(int x, int y){
        System.out.println("Result: "+(x*y));
    }
}
class HyCalculator{
    public void calculate(int x, int y){
        System.out.println("Result: "+Math.sin(x+y));
    }
}
public class Main_67{
    public static void main(String[] args){
        System.out.println("main method");
        ScCalculator sc=new ScCalculator();
        sc.calculate(5, 8);
    }
}
