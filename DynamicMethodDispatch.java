class Paren
{
	static float a=10000.00f;
	public float Paysalary()
	{
		return a;
	}
}
class Chil extends Paren
{
	@Override
	public float Paysalary()
	{
		return a+1500.00f;
	}
	public float Paybonus()
	{
		return a+30000.00f;
	}
}
public class DynamicMethodDispatch 
{
	public static void main(String[] args)
	{
		Paren p = new Chil();//Dynamic method dispatch having a reference of super class and object of sub class
		System.out.println(p.Paysalary());//in case of Dynamic method dispatch We can Access only those methods of Child class which are declared in Parent //class
	}
}
