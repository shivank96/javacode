import java.util.*;
public class ArithmeticOperationsUsingSwitch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true)
		{
			int a;
			System.out.println("Enter your choice among following ");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.exit");
			a=s.nextInt();
		switch(a)
		{
		case 1:System.out.println("Enter the number of values for which you want to find sum ");
		int v=s.nextInt();
		int b[]=new int[v];
		System.out.println("Enter all the numbers ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
		}
		System.out.println("Sum of all numbers is "+sum);
		break;
		case 2:System.out.println("Enter the number of values for which you want to find difference ");
		int v1=s.nextInt();
		int b1[]=new int[v1];
		System.out.println("Enter all the numbers ");
		for(int i=0;i<b1.length;i++)
		{
			b1[i]=s.nextInt();
		}
		int difference=0;
		for(int i=0;i<b1.length;i++)
		{
			if(i==0)
			{
			difference+=b1[i];
			}
			else
				difference-=b1[i];
		}
		System.out.println("Difference of all numbers is "+difference);
		break;
		case 3:System.out.println("Enter the number of values for which you want to find product ");
		int v2=s.nextInt();
		int b2[]=new int[v2];
		System.out.println("Enter all the numbers ");
		for(int i=0;i<b2.length;i++)
		{
			b2[i]=s.nextInt();
		}
		int product=1;
		for(int i=0;i<b2.length;i++)
		{
			product*=b2[i];
		}
		System.out.println("Product of all numbers is "+product);
		break;
		case 4:return;
		}
		}
	}
}
