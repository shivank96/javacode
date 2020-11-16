class sup
{
	private int a=10;
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
	}
}
public class SuperThis 
{
	public static void main(String[] args)
        {
		sub c=new sub(15,25);
        }
}
//output:
//calling current class member(object) using this keyword 10
//formal argument value 15
//We use super keyword to execute the parameterized constructor of parent class
//calling current class member(object) using this keyword 20
//formal argument value 25
