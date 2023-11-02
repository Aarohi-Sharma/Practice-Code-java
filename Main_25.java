public class Main_25 {
    public static void main(String[] args) {
        for (int i=4; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        int sum=0;
        int i=1;
        while (i<=5){
            sum=sum+(2*i);
            i++;
        }
        System.out.println("Sum of first 5 even numbers is: "+sum);
        for (int a=1; a<=10; a++){
            System.out.println("5x"+a+"="+(5*a));
        }
        for (int a=10; a>=1; a--){
            System.out.printf("10x%d=%d", a, (10*a));
            System.out.print("\n");
        }
        int prod=1, n=6;
        while (n>=1){
            prod=prod*n;
            n--;
        }
        System.out.println("Factorial of 6 is: "+prod);
        int sum2=0;
        for (int b=1; b<=10; b++){
            sum2=sum2+(8*i);
        }
        System.out.println("Sum of 10 multiples of 8 is: "+sum2);

    }
}
