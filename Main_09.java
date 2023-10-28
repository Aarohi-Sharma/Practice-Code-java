public class Main_09 {
    public static void main(String args[]) {
        int a= 6*5-34/2;
        int b= 60/5-34*2;
        System.out.println("Example of precedence:"+a);
        System.out.println("Example of associativity:"+b);
        int c=4, d=6, e=10;
        int f=(c*c-(4*d*c))/2*d;
        System.out.println(d);
    }
}
