public class VarArgs
{
	static void Display(int ...x)
	{
		for(int a:x)
			System.out.println(a);
	}
	static void Showlist(int n,String ...a)
	{
		for(String s:a)
		{
			System.out.println(n+". "+s);
			n++;
		}
	}
	public static void main(String[] args) {
		int a[]= {10,11,12,13,14};
		Display();
		Display(4,5,6);
		Display(new int[] {7,8,9});
		Display(a);
		Showlist(1,"Ram","Vijay","ravi");
	}
}
