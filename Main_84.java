class NegRadiusExcep extends Exception{
    public String toString(){
        return "radius can't be negative";
    }
    public String getMessage(){
        return "radius can't be negative";
    }
}
public class Main_84 {
    public static double area(int r) throws NegRadiusExcep{
        if (r<0){
            throw  new NegRadiusExcep();
        }
        double res=Math.PI*r*r;
        return res;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int res=a/b;
        return res;
    }
    public static void main(String[] args) {
        try {
            int c = divide(20, 0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("exception "+e);
        }
        try{
            double ar=area(-3);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("exception "+e);
        }
    }
}
