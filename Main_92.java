import java.util.*;
public class Main_92 {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        LinkedList<Integer> l2= new LinkedList<>();
        l2.add(234);
        l2.add(594);
        l2.add(718);
        l1.add(6);
        l1.add(89);
        l1.add(67);
        l1.add(32);
        l1.add(5);
        l1.addAll(l2);
        l1.addLast(899);
        System.out.println("L1 is:");
        for(int i: l1){
            System.out.print(i);
            System.out.print(" ");
        }
        int i=0;
        System.out.print("\n");
        System.out.println("l2 is:");
        while(i<3){
            System.out.print(l2.get(i));
            System.out.print(" ");
            i++;
        }
        System.out.print("\n");
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(238));
        l1.remove(4);
        System.out.println(l1.contains(5));
    }
}
