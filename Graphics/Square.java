package Graphics;
import java.util.*;
import java.io.*;

public class Square implements TestInterface
{
	int x;

	public void area()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter the side of Square:");
		  x = sc.nextInt();

		  System.out.println("area of the square : "+Math.pow(x, 2)+" sq units");
	}
}
