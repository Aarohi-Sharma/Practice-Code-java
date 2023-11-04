public class Main_34 {
    static int fact(int n){
        if (n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    static int fibo(int m){
        if (m==0)
            return 0;
        else if (m==1)
            return 1;
        else
            return fibo(m-1)+fibo(m-2);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 6 is: "+fact(6));
        for (int i=0; i<7; i++){
            System.out.println(fibo(i));
        }
    }
}
