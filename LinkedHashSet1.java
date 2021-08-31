import java.util.*;
import java.util.LinkedHashSet;
import java.io.*;
class LinkedHashSet1
{
 public static void main(String args[]){
 //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("Athulya");
               set.add("sneha");
               set.add("chithra");
               set.add("haritha");
               set.add("aneesha");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
 }
}
