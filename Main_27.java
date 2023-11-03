public class main_27 {
    public static void main(String[] args) {
        int[] marks={45, 67, 23, 94, 17};
        System.out.println(marks.length);
        float[] num={45.6f, 78.9f, 45f, 23.9f, 29.6f};
        System.out.println(num[2]);
        String[] name={"rohan", "yash", "tarun", "riya", "kush"};
        System.out.println(name.length);
        System.out.println(name[3]);
        for(int i=0; i<name.length; i++){
            System.out.print(name[i]);
            System.out.print("\t");
        }
        System.out.print("\n");
        for (int i=num.length-1; i>=0; i--){
            System.out.print(num[i]);
            System.out.print("\t");
        }
        System.out.print("\n");
        for (int i:marks){
            System.out.print(i);
            System.out.print("\t");
        }
    }
}
