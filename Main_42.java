class Student4{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public Student4(String nam, int idd){
        id=idd;
        name=nam;
    }
    public Student4(){
        id=67;
        name="Your name:";
    }
}
public class Main_42 {
    public static void main(String[] args) {
        Student4 ram = new Student4("ram", 90);
        //ram.setName("Wali");
        //ram.setId(67);
        System.out.println(ram.getName());
        System.out.println(ram.getId());
        Student4 tom=new Student4();
        System.out.println(tom.getName());
        System.out.println(tom.getId());
        Student4 susan= new Student4();
        susan.setName("Wali");
        susan.setId(34);
        System.out.println(ram.getName());
        System.out.println(ram.getId());
    }
}
