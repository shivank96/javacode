import java.util.*;
public class Digits {
	public static void main(String []args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int n1=n;
	String str="";
	int r=0,acount=0;
//Reverse of a number logic
	while(n>0)
	{
	int rem=0;
	rem+=n%10;
	n=n/10;
	r=r*10+rem;
//Concatenating a number with tailing zeros with string 
	str+=rem;
	acount++;
	}

	System.out.println("reverse of a number is "+str+r);
//Converting string to int
	int rev = Integer.parseInt(str);
//To find the number is palindrome or not
	if(rev==n1)
		System.out.println("Palindrome number");
	int count=0;
	int p=0;
	while(r>0)
	{
		int digit=r%10;
		System.out.println(digit+" ");
		if(acount>0&&acount<4)
		p=p+(digit*digit*digit);
		else if(acount>3&&acount<5)
			p=p+(digit*digit*digit*digit);
		r=r/10;
		count++;
	}
System.out.println("Count of digits is "+count);
//To find whether the entered number is armstrong or not
if(p==n1)
{
	System.out.println("armstrong number"+p);
}
	
}
}