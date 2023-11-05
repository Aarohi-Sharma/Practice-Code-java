class Student2{
    int marks;
    String name;
    public int marks(){
        return marks;
    }
    public String name(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
}
class Phone{
    public void ring(){
        System.out.println("can ring");
    }
    public void vibrate(){
        System.out.println("can vibrate");
    }
    public void call(){
        System.out.println("can call");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Circle{
    float radius;
    float pi=3.14f;
    public float area(){
        return pi*radius*radius;
    }
    public float perimeter(){
        return 2*pi*radius;
    }
}
public class Main_39 {
    public static void main(String[] args) {
        Student2 yash=new Student2();
        yash.marks=78;
        yash.setname("sharma");
        System.out.println(yash.name);
        System.out.println(yash.marks);
        Phone vivo=new Phone();
        vivo.call();
        vivo.ring();
        vivo.vibrate();
        Square sq=new Square();
        sq.side=6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        Circle ci=new Circle();
        ci.radius=7;
        System.out.println(ci.area());
        System.out.println(ci.perimeter());
    }
}
