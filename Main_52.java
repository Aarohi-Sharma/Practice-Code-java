class Circle1 {
    public int radius;

    Circle1(int a) {
        System.out.println("circle");
        this.radius = a;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder3 extends Circle1{
    public int height;
    Cylinder3(int a, int b){
        super(a);
        System.out.println("cylinder");
        this.height=b;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Rectangle1{
    public int length, breadth;
    Rectangle1(int l, int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle1{
    public int height;
    Cuboid(int l, int b, int h){
        super(l, b);
        this.height=h;
    }
    public float volume(){
        return area()*height;
    }
}
public class Main_52 {
    public static void main(String[] args) {
        Circle1 c=new Circle1(7);
        System.out.println("area of circle: "+c.area());
        Cylinder3 cy=new Cylinder3(7, 4);
        System.out.println("volume of cylinder: "+cy.volume());
        Rectangle1 r=new Rectangle1(5, 7);
        System.out.println("area of rectanger: "+r.area());
        Cuboid cb=new Cuboid(5, 6, 6);
        System.out.println("volume of cuboid: "+cb.volume());
    }
}
