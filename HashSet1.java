import java.util.*;
import java.io.*;
import java.util.HashSet;
public class HashSet1
{
    public static void main(String[] args) {
          HashSet<Integer> hset = new HashSet<Integer>();
          hset.add(100);
          hset.add(120);
          hset.add(150);
            hset.add(200);
          System.out.println("Hash set Elements are...");
 Iterator<Integer> p = hset.iterator();
   while (p.hasNext())
      {
     System.out.println(p.next());
          }
         System.out.println("Is the hashset empty: " + hset.isEmpty());
        System.out.println("Size of the Hash Set: " + hset.size());
        hset.clear();
        System.out.println("after clearing the hash set");
         System.out.println("Is the hashset empty: " + hset.isEmpty());
}
}
