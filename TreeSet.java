import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.*;

public class TreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> tSet = new TreeSet<Integer>();
          tSet.add(30);
            tSet.add(11);
              tSet.add(99);
        tSet.add(7);
        tSet.add(3);
        tSet.add(1);

        System.out.println("TreeSet contains: " + tSet);
        Set<Integer> reverseSet = tSet.descendingSet();

        Iterator<Integer> itr = reverseSet.iterator();

        System.out.println("Reverse set contains: ");
        while(itr.hasNext()){
            System.out.println( itr.next() );
        }
    }
}
