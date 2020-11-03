public class MethodOverloading {
	int reverse(int num)
	{
		int rem,rev=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		return rev;
	}
    void reverse(int a[])
	{
    	int c[]=new int[a.length];
		for(int i=a.length-1,j=0;j<a.length;i--,j++)
		{
			c[j]=a[i];
		}
		for(int i=0;i<c.length;i++)
		{
			a[i]=c[i];
		}
	}
public static void main(String[] args) 
{
		int b[]=new int[] {6,7,8,9,10};
		 MethodOverloading m=new  MethodOverloading();
		 System.out.println(m.reverse(327));
		 m.reverse(b);
		 for(int i=0;i<b.length;i++)
				System.out.println(b[i]);
	}
}
