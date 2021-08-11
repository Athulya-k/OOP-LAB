public class Oop2_1
{
    
    public static void main(String[] args)
    {
       areas ob = new areas();
	   ob.area(4);
	   ob.area(10,13);
	   ob.area(7.6);
    }
}
class areas
{
    void area(float x)
    {
        System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is "+z+" sq units");
    }
}