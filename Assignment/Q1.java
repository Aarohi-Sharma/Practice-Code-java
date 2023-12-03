class Stud{
    public Stud(){
        System.out.println("No name provided");
    }
    public Stud(String name){
        System.out.println("Your name is: "+name);
    }
}
public class assign1 {
    public static void main(String[] args) {
        Stud riya=new Stud();
        Stud Karan=new Stud("Karan");
    }
}
