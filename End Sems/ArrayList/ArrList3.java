import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class Array3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(19);
        list1.add(28);
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(90);
        list2.addAll(list1);
        System.out.println(list2);
        System.out.println(list2.get(2));
        System.out.println(list2.indexOf(90));
        System.out.println(list2.contains(3));
        HashSet<Integer> set=new HashSet<Integer>();
        set.addAll(list2);
        System.out.println(set);
        Iterator<Integer> itr=list2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
