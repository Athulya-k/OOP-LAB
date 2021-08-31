import java.util.*;
import java.io.*;
  public class LinkedListRemove
   {
  public static void main(String[] args) {
    
     LinkedList<String> l_list = new LinkedList<String>();
   
          l_list.add("father");
          l_list.add("mother");
          l_list.add("brother");
          l_list.add("sister");
          l_list.add("cousin");

     
   System.out.println("The Original linked list: " + l_list);

 
    l_list.clear();

    System.out.println("The New linked list: " + l_list);
  }
}
