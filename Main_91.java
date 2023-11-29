import java.util.*;
public class Main_91 {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>(5);
        l2.add(234);
        l2.add(594);
        l2.add(718);
        l1.add(6);
        l1.add(89);
        l1.add(67);
        l1.add(32);
        l1.add(5);
        l1.addAll(l2);
        System.out.println("L1 is");
        for(int i: l1){
            System.out.println(i);
        }
        int i=0;
        System.out.println("l2 is");
        while(i<3){
            System.out.println(l2.get(i));
            i++;
        }
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(238));
        l1.remove(4);
        System.out.println(l1.contains(5));
    }
}
