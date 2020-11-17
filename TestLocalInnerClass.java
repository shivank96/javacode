class Shape
{
	int l,b;
	public void Rectangle()
	{
		class Inner
		{
			
			Inner(int len,int bre)
			{
				l=len;
				b=bre;
			}
			int area()
			{
				return l*b;
			}
		}
		Inner i=new Inner(10,5);
		System.out.println(i.area());
	}
}
public class TestLocalInnerClass 
{
	public static void main(String[] args)
 {
		Shape s=new Shape();
		s.Rectangle();

	}
}
