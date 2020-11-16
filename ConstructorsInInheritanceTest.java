class parent
{
	parent()
	{
		System.out.println("Default consturctor of parent class");
	}
	parent(int a)
	{
		System.out.println(a+" Param of parent");
	}
}
class child extends parent
{
	child()
	{
		System.out.println("Default consturctor of child class");
	}
	child(int a,int b)
	{
		super(a);//calls the parameterized constructor of parent class
		System.out.println(b+" Param of child");
	}
}
class grandchild extends child
{
	grandchild()
	{
		System.out.println("Default consturctor of grandchild class");
	}
	grandchild(int a,int b,int c)
	{
		super(a,b);//calls the parameterized constructor of child class
		System.out.println(c+"Param of grandchild");
		
	}
}
public class ConstructorsInInheritance 
{
	public static void main(String[] args)
	{
		parent p=new parent();
		child c=new child(10,5);
		child c1=new child();
		grandchild g=new grandchild(11,12,13);
		grandchild g1=new grandchild();
	}

}
