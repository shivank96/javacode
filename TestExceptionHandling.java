import java.util.*;
public class TestExceptionHandling 
{
public static void main(String []args)
{
	try
	{
		int a[]=new int[5];
		int r;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int a1,b1;
		a1=s.nextInt();
		b1=s.nextInt();
		try
		{
			r=a[a1]/a[b1];
			System.out.println(r);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int a2=s.nextInt();
		System.out.println(a[a2]);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
