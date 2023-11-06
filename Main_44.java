class Cylinder{
    private int radius, height;
    float pi=3.14f;
    public void setHeight(int h){
        height=h;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public float volume(){
        float vol=pi*radius*radius*height;
        return vol;
    }
}
class Rectangle{
    private int length, breadth;
    public Rectangle(){
        length=4;
        breadth=5;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class Main_44 {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder();
        cy.setRadius(5);
        cy.setHeight(16);
        int h=cy.getHeight();
        System.out.println(h);
        System.out.println(cy.getRadius());
        System.out.println("Volume: "+cy.volume());
        Rectangle r= new Rectangle();
        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());
    }
}
