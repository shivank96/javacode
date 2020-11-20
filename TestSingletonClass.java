import java.util.*;
class TestStudent
{
	private String name;
	static private TestStudent ts= null;
	static int count=1;
	private TestStudent(String name)
	{
		this.name=name;
	}
	static public TestStudent getInstance(String n)
	{
		if(count<=5) {
			ts=new TestStudent(n);//limiting to one object creation of class TestStudent
			count++;}
//		if(ts==null)
//			ts=new TestStudent(n);//limiting to only five object's creation of class TestStudent
		
		return ts;
	}
	void getName()
	{
		System.out.println("name is "+name);
	}
}
public class TestSingletonClass
{
	public static void main(String[] args) 
	{
		TestStudent ts[] = new TestStudent[5];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<ts.length;i++)
		{
			String n;
			System.out.println("Enter a name ");
		    n=sc.nextLine();
		    ts[i] = TestStudent.getInstance(n);
		    ts[i].getName();
		}
		for(TestStudent t:ts)
		{
			t.getName();//accessing using for each loop
		}
//		TestStudent ts = TestStudent.getInstance("passsomenameasargument");
//		TestStudent ts1 = TestStudent.getInstance("passsomenameasargument");
//		ts.getName();
//		ts1.getName();
//		if(ts==ts1)
//			System.out.print("same");
//		System.out.print(ts+" "+ts1);
		//System.out.println(ts.getName());

	}
}
