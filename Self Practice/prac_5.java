class School {
  private int roll;
  private String name;
  School(int a) {
    System.out.print(a);
  }
  private School() {}
  private void print() {
    System.out.println("This is the School class");
  }
}
public class prac_5 {
  public static void main(String args[]) {
    School ob1 = new School(1);
    School ob = new School();
    ob.name = "Aayush";
    ob.print();
  }
}
