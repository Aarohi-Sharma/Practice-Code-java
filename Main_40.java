class Student3{
    private int id;
    private String name;
    public void sname(String n){
        name=n;
    }
    public void sid(int i){
        id=i;
    }
    public String gname(){
        return name;
    }
    public int gid(){
        return id;
    }
}
class Circle2{
    private float radius, area, circum;
    float pi=3.14f;
    public void sradius(float r){
        radius=r;
    }
    public void sarea(){
        area=pi*radius*radius;
    }
    public void scircum(){
        circum=2*pi*radius;
    }
    public float garea(){
        return area;
    }
    public float gcircum(){
        return circum;
    }
}
public class Main_40 {
    public static void main(String[] args) {
        Student3 opla=new Student3();
        opla.sname("Wali");
        System.out.println(opla.gname());
        Circle2 cr=new Circle2();
        cr.sradius(7);
        cr.sarea();
        cr.scircum();
        System.out.println("Area: "+cr.garea());
        System.out.println("Circumference: "+cr.gcircum());
    }
}
