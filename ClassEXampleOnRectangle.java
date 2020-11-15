class Rectangle
{
	private int length,breadth;
	Rectangle()
	{
		length=1;
		breadth=1;
	}
	Rectangle(int l,int b)
	{
		setLength(l);
		setBreadth(b);
	}
	void setLength(int l)
	{
		if(l>0)
			length=l;
		else
			length=1;
	}
	void setBreadth(int b)
	{
		if(b>0)
			breadth=b;
		else
			breadth=1;
	}
	int getLength()
	{
		return length;
	}
	int getBreadth()
	{
		return breadth;
	}
	boolean isSquare()
	{
		return length==breadth;
	}
	int area()
	{
		return length*breadth;
	}
	
}

public class ClassExampleOnRectangle {

	public static void main(String[] args) {
		
                Rectangle r=new Rectangle();
               System.out.println(r.area());
               Rectangle r1=new Rectangle(10,5);
               System.out.println(r1.area());
               System.out.println(r.isSquare());

	}

}
