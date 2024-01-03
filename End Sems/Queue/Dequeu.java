import java.util.*;
public class Dequeu{
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(12);
        deque.add(54);
        deque.add(34);
        for (int i : deque) {
            System.out.println(i);
        }
    }
}

