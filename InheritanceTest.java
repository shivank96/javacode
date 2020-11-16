class Rectangle
{
	private int length,breadth;
	Rectangle(int l,int b)
	{
		setLength(l);
		setBreadth(b);
	}
	void setLength(int l)
	{
		if(l>0)
			this.length=l;
		else
			this.length=1;
	}
	void setBreadth(int b)
	{
		if(b>0)
			this.breadth=b;
		else
			this.breadth=1;
	}	
	int getLength()
	{
		return this.length;
	}
	int getBreadth()
	{
		return this.breadth;
	}
	int area()
	{
		return getLength()*getBreadth();
	}
	int perimeter()
	{
		return 2*(getLength()+getBreadth());
	}
	boolean isSquare()
	{
		return length==breadth;
	}
}
class Cuboid extends Rectangle
{
	private int height;
	Cuboid(int length,int breadth,int height)
	{
		super(length,breadth);//We use super for executing the param constructor of parent class 
		setHeight(height);
	}
	void setHeight(int h)
	{
		if(h>0)
			this.height=h;//we use this which refers to current class object
		else
			this.height=1;
	}
	int getHeight()
	{
		return height;
	}
	int volume()
	{
		return area()*height;
	}
}
public class InheritanceTest 
{
	public static void main(String[] args)
	{
	Cuboid c=new Cuboid(10,5,8);
	System.out.println(c.isSquare());
	System.out.println(c.perimeter());
	System.out.println(c.volume());
	}

}
