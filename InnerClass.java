class Outer
{
int x=10;
class inner
{
	int y=20;
	inner()
	{
		System.out.println("Default constructor of inner class");
	}
	void innerDisplay()
	{
		System.out.println(x+"+"+y+"="+(x+y));//An inner class in java can access members of outer class even if they are non static because those are treated //as global but an outer class can access inner class methods only by creating an object of inner class 
	}
}
inner i=new inner();//This is also a way to create an object of inner class in outer class
Outer()
{
	System.out.println("Default constructor of outer class");
}
void OuterDisplay()
{
	inner i=new inner();
	i.innerDisplay();
	System.out.println(i.y);
}
}
public class NestedClass 
{
	public static void main(String[] args) 
	{
		Outer o=new Outer();//Creating an object of outer class and can access only outer class members
		o.OuterDisplay();
		//Outer.inner i=new Outer().new inner();//A way to create inner class object but not recommended
		//i.innerDisplay();
	}
}
