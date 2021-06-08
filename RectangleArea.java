class Rectangle
{
	
	float  length;
	float  breadth;

	void setData(float l, float b)
	{
	      length  = l;
	      breadth = b;
	}

	float  getArea()
	{
	      return  length * breadth;
	}

}
class RectangleArea2
{		
	public static void main(String[] arg)
                {
	
	       Rectangle  r1 =  new  Rectangle();
	       Rectangle  r2 =  new  Rectangle();
	       Rectangle  r3 =  new  Rectangle();
	       r1.setData(12.4f , 13f);
	       r2.setData(10.5f , 9f);
	       r3.setData(13f , 14f);
	       float  area1=r1.getArea();
	       float  area2=r2.getArea();
	       float  area3=r3.getArea();
	       System.out.println("area of 1st rectangle=" +area1);
	       System.out.println("area of 2nd rectangle=" +area2);
	       System.out.println("area of 3rd rectangle=" +area3);
		
		
                }	
}
	
	