
import java.io.*;
class StringAndStringBuffer
 {
	public static void main(String[] args)
	{
	StringBuffer s = new StringBuffer("Athulya");
		int p = s.length();
		int q = s.capacity();
		System.out.println("Length of string Athulya=" + p);
		System.out.println("Capacity of string Athulya=" + q);
    s.append(" k");
    System.out.println("After Appending="+s);
    s.insert(8, "-");
    System.out.println("After inserting - @possition 8="+s);
    s.reverse();
    System.out.println("After reversing ="+s);
    s.delete(0, 2);
            System.out.println("After deteting the array from 0 to 2 possition="+s);
            s.deleteCharAt(1);
            System.out.println("After deteting a character @1 possition="+s);
            s.replace(0,5,"a");
            System.out.println("After replacing with 'a' from 0th to 5th possition ="+s);

            String s1="Welcome To Java Programming";
          char ch[]={'S','t','r','i','n','g'};
          String s2=new String(ch);
          System.out.println("string s2="+s2);
          System.out.println("string s1="+s1);
          char c=s1.charAt(5);
           System.out.println("return 5th index= "+c);
           System.out.println("string length of s1: "+s1.length());
           s1=s1.concat(" friends");
           System.out.println("After concatenation with string s1 ="+s1);
           
           
String s1lower=s1.toLowerCase();
System.out.println("lower case of string 1 is"+s1lower);
String s1upper=s2.toUpperCase();
System.out.println("upper case of string 2 is"+s1upper);
String s6="  hello string   ";
System.out.println("without trimming:");
System.out.println(s6+"welcome");
System.out.println("with trimming:");
System.out.println(s6.trim()+"welcome");
}
}
