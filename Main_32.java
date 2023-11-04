public class Main_32 {
    static void name(){
        System.out.println("learning code");
    }
    void str(){
        System.out.println("with java");
    }
    static void change(int a){
        a=98;
    }
    static void change1(int[] arr){
        arr[0]=98;
    }
    static void io(){
        System.out.println("greetings");
    }
    static void io(int a){
        System.out.println("greetings "+a);
    }
    static void io(int a, float b){
        System.out.println("greetings "+a+" "+b);
    }
    public static void main(String[] args) {
        name();
        Main_32 func=new Main_32();
        func.str();
        int x=45;
        int[] num={32, 45, 67};
        change(x);
        change1(num);
        System.out.println("After changing x is: "+x);
        System.out.println("After changing element is: "+ num[0]);
        io();
        io(45);
        io(34, 98.7f);
    }
}
