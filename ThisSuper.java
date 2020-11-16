class sup
{
	private int a=10;
        int b=30;
	sup(int a)
	{
		System.out.println("calling current class member(object) using this keyword "+this.a);
		System.out.println("formal argument value "+a);
	}
}
class sub extends sup
{
	private int b=20;
	sub(int a,int b)
	{
		super(a);
		System.out.println("We use super keyword to execute the parameterized constructor of parent class");
		System.out.println("calling current class member(object) using this keyword "+this.b);
		System.out.println("formal argument value "+b);
                System.out.println("using super keyword we can also call parent class member(variable)"+super.b);
		//Here we are accessing the parent class variable in sub class using super keyword
	}
}
public class SuperThis 
{
	public static void main(String[] args)
        {
		sub c=new sub(15,25);
        }
}

