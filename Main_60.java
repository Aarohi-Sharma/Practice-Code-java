abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void refill() {
        System.out.println("refill");
    }
    void write() {
        System.out.println("write using pen");
    }
    void change(){
        System.out.println("change nip");
    }
}
class Monkey implements Animal{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
    public void eat() {
        System.out.println("eating");
    }
    public void sleep() {
        System.out.println("sleeping");
    }
}
class Human extends Monkey{
    void speak(){
        System.out.println("hello");
    }
}
interface Animal{
    void eat();
    void sleep();
}
public class Main_60 {
    public static void main(String[] args) {
        FountainPen p=new FountainPen();
        p.refill();
        Human ram=new Human();
        ram.sleep();
        ram.speak();
        Monkey m=new Human();
        m.bite();
    }
}
