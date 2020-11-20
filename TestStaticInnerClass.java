class Out
{
	static int x=10;
	int y=20;
	static class Inner
	{
		void display()
		{
			System.out.println(x);
		}
	}
}
public class TestStaticInnerClass 
{
	public static void main(String[] args) 
	{
		Out.Inner i= new Out.Inner();//Unlike for nested classes we can directly create an object for inner class withou depending on outer class
		i.display();
		Out.x=80;
		System.out.println(Out.x);
	}
}
