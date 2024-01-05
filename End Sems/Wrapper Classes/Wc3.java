class SpeedWrapperClass{
    private int speed;
    SpeedWrapperClass(){}
    SpeedWrapperClass(int speed){
        this.speed=speed;
    }
    public int getVehicleSpeed(){
        return speed;
    }
    public void setVehicleSpeed(int speed){
        this.speed=speed;
    }
    public String toString() {
        return Integer.toString(speed);
    }
}
public class Wc3{
    public static void main(String[] args){
        SpeedWrapperClass speedValue =new SpeedWrapperClass(100);
        System.out.println(speedValue);
    }
}
