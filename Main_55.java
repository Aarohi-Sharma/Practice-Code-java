interface Bicycle{
    int s=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void applyHorn();
    void applyBrake(int decrement);
}
class AvonCycle implements Bicycle, HornBicycle{
    public void applyBrake(int decrement){
        System.out.println("apply brake");
    }
    public void speedUp(int increment){
        System.out.println("apply brake");
    }
    public void applyHorn(){
        System.out.println("apply horn");
    }
}
public class Main_55 {
    public static void main(String[] args) {
        AvonCycle a=new AvonCycle();
        a.applyBrake(1);
        System.out.println(a.s);
        a.applyHorn();
    }
}
