//class MyRun implements Runnable
//{
//	public void run() {}
//
//}
class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
		//setter method foe setting priority
		setPriority(Thread.MIN_PRIORITY+6);
	}
	public void run()
	{
		int count=1;
		while(true)
		{
			System.out.println(count+++"my thread");
//			try
//			{
//				//sleep method
//			Thread.sleep(1000);
//			}
//			catch(InterruptedException e)
//			{
//				System.out.println(e);
//			}
					
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//Thread t = new Thread(new MyRun(),"My thread");
		MyThread t = new MyThread("thread1");
		//getter methods
//		System.out.println(t.getId());
//		System.out.println(t.getName()+" "+t.getPriority());
//		t.start();
//		System.out.println(t.getState());
		//enquiry method
//		System.out.println(t.isAlive());
		//Setting a thread as daemon thread so that its execution will be ended when main method ends its execution
		//t.setDaemon(true);
		//To start a thread i.e., actual implementation of multithreading which calls run method 
		t.start();
		int count=1;
		while(true)
		{
			System.out.println(count+++"main");
			//Yield method will make a thread wait and gives more time to other threads to execute
			Thread.yield();
//			try
//			{
//				//sleep method
//			Thread.sleep(1000);
//			}
//			catch(InterruptedException e)
//			{
//				System.out.println(e);
//			}
					
		}
		//interrupt method
		//t.interrupt();
		//try {t.sleep(100);}catch(Exception e) {}
		//getting reference of main thread using current thread method
//		Thread mt = Thread.currentThread();
		//making main thread to join with other threads makes this main thread to wait for all other threads to complete their excecution
		//even if any thread is daemon till it gets finished main thread waits for it by using join method
//		mt.join();
		
	}

}
