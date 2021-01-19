class MyPrint
{
	synchronized public void display(String str)
	{
//		synchronized(this)
//		{
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e){}			
		}
//		}
	}
}
class MyThread1 extends Thread
{
	MyPrint p;
	String name;
	public MyThread1(MyPrint pr,String na)
//	public MyThread1(MyPrint pr)
	{
		this.p=pr;
		this.name=na;
	}
	public void run()
	{
		p.display(name);
//		p.display("Hello world");
	}
}
//class MyThread2 extends Thread
//{
//	MyPrint p;
//	public MyThread2(MyPrint pri)
//	{
//		this.p=pri;
//	}
//	public void run()
//	{
//		p.display(" Welcome ");
//	}
//}
public class TestSynchronization1 {

	public static void main(String[] args) 
	{
		MyPrint p =new MyPrint();
		MyThread1 t1 = new MyThread1(p,"Hello world");
//		MyThread1 t1= new MyThread1(p);
//		MyThread2 t2= new MyThread2(p);
		MyThread1 t2= new MyThread1(p," Welcome ");
		t1.start();
		t2.start();
	}

}
