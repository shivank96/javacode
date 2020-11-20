class Employee
{
	static float a=10000.00f;
	public float Paysalary()
	{
		return a;
	}
}
class Clerk extends Employee
{
	@Override
	public float Paysalary()
	{
		return a+15000.00f;
	}
}
class Manager extends Employee
{
	@Override
	public float Paysalary()
	{
		return a+25000.00f;
	}
}
public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		Manager m = new Manager();
		System.out.println("The salary of the Manager is "+m.Paysalary());
		Clerk c = new Clerk();
		System.out.println("The salary of the Clerk is "+c.Paysalary());
	
	}
}
