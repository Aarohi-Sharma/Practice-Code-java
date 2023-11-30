import java.util.ArrayDeque;
public class Main_93 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println("Ad1 is:");
        for (int i: ad1){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}

