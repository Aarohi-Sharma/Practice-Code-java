public class Main_35 {
   static void table(int n){
       for (int i=1; i<=10; i++){
           System.out.printf("%dx%d=%d", n, i, n*i);
           System.out.print("\n");
       }
   }
   static void patter(int n){
       for (int i=1; i<=n; i++){
           for (int j=1; j<=i; j++){
               System.out.print("*\t");
           }
           System.out.print("\n");
       }
   }
   static int sum (int n){
       int sum=0;
       if (n==1)
            sum=1;
       else
           sum=n+sum(n-1);
       return sum;
   }
   static void rpatter(int n){
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
   }
   int fibo(int n){
       if (n==2)
           return 1;
       else if (n==1)
           return 1;
       else
           return fibo(n-1)+fibo(n-2);
   }
   int avg(int ...arr){
       int sum=0;
       for (int i:arr){
           sum=sum+i;
       }
       return sum/arr.length;
   }
   public static void main(String[] args) {
       System.out.println("Table of 7:");
       table(7);
       System.out.println("Patter:");
       patter(4);
       System.out.println("sum of first 10 natural nos: "+sum(10));
       System.out.println("reverse pattern:");
       rpatter(4);
       Main_35 func=new Main_35();
       System.out.println("7th term: "+func.fibo(7));
       System.out.println("average of 1, 56, 78, 34, 25: "+func.avg(1, 56, 78, 34, 25));
   }

}
