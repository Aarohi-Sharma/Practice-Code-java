import java.util.*;
public class Vecto{
    public static void main(String args[]){
        Vector<Integer> v= new Vector<Integer>();
        v.add(12);
        v.add(34);
        v.add(67);
        v.add(56);
        Iterator<Integer> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
