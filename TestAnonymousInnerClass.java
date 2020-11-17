abstract class My
{
	int l,b;
	My(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	abstract int area();
}
class Shap 
{
	int l,b;
	Shap(int len,int bre)
	{
		l=len;
		b=bre;
	}
	public void Rectanlge()
	{
		My m=new My(l,b) {
			public int area()
			{
				return l*b;
			}
		};
		System.out.println(m.area());
	}
}
public class TestAnonymousInnerClass
{
	public static void main(String ...args)
	{
		new Shap(10,10).Rectanlge();
	}
}