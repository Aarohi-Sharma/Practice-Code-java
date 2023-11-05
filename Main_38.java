class Student{
    int id;
    String name;
    public void print(){
        System.out.println("Id is: "+ id);
        System.out.println("Name is: "+name);
    }
}
public class Main_38 {
    public static void main(String[] args) {
        System.out.println("hello");
        Student riya =new Student();
        riya.id=104973;
        riya.name="gupta";
        riya.print();
        Student mahi=new Student();
        mahi.id=17728;
        mahi.name="punjia";
        mahi.print();
    }
}
