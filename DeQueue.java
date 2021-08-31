import java.util.*;
import java.io.*;
public class DeQueue
 {
    public static void main(String[] args)
 {
        Deque<String> deque = new LinkedList<String>();
        deque.add("One");          
        deque.addFirst("Two");     
        deque.addLast("Three");    
        deque.push("Four");        
        deque.offer("Five");       
        deque.offerFirst("Six");    
        deque.offerLast("Seven");  
        System.out.println("Initial Deque:");
        System.out.print(deque + " ");
        System.out.println("\n\nDeque contents using Standard Iterator:");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.print(" " + iterator.next());
      System.out.println("\n Deque Pop:" + deque.pop());
        System.out.println("\n Deque,After pop:" + deque);
        deque.removeFirst();        
        deque.removeLast(); 
        System.out.println("\n Deque, after removing "  + "first and last elements using removeFirst() & removeLast() method is: " + deque);
         deque.poll();
         System.out.println("\n After removing  an element from the beginning of the Deque using poll() method is:" + deque);
        deque.pollLast();
        System.out.println("\n After removing an element from the end (tail) of the Deque using pollLast()method is:" + deque);
        deque.pollFirst();
        System.out.println("\n After removing  an element from the beginning of the Deque using pollFirst() method is:" + deque);

   }
}
