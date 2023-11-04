public class Main_33 {
    static int sum(int ...arr){
        int sum=0;
        for (int i:arr){
            sum=sum+i;
        }
        return sum;
    }
    static int mul(int x, int ...arr){
        int prod=1;
        for (int i:arr){
            prod=prod*i;
        }
        return prod;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 45, 67: "+sum(45, 67));
        System.out.println("sum of 23, 19, 67, 89: "+sum(23, 29, 67, 89));
        System.out.println("Product of 34, 90, 4: "+mul(4, 34, 90));
    }
}
