import java.util.*;
public class LeapYear 
{
	public static void main(String[] args)
 {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
					System.out.println(n+" is a leap year");
				else
					System.out.println(n+" is not a leap year");
			}
			else
			System.out.println(n+" is a leap year");
		}
		else
			System.out.println(n+" is not a leap year");
	}
}
