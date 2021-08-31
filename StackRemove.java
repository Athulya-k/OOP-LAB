// Java code to illustrate remove() when position of
// element is passed as parameter
import java.io.*;
import java.util.*;

public class StackRemove {
	public static void main(String args[])
	{

		
		Stack<String> stk = new Stack<String>();

		
		stk.add("Athulya");
    	stk.add("hello");
      	stk.add("welcome to");
		stk.add("java");
		stk.add("programming");
		stk.add("35");
		stk.add("45");

		
		System.out.println("Stack elements are: " + stk);

		
		String rem_ele = stk.remove(4);

		
		System.out.println("Removed element: "	+ rem_ele);

		
		System.out.println("Final Stack elements are: "	+ stk);
	}
}
