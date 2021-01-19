class Atm
{
//way 2 of synchronization
	synchronized public void CheckBalance(String name)
	{
		System.out.print(name+" checking ");
		try{Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("balance");
//		System.out.println();
	}
	synchronized public void Withdraw(String name,int amnt)
	{
//way 3 of synchronization
		//synchronized(this)
		//{
		System.out.print(name+" Withdrawing");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println(amnt);
//		System.out.println();
		//}
	}

}
class Customer extends Thread
{
	Atm atm;
	String name;
	int amount;
	Customer(Atm a,String na,int am)
	{
		this.atm=a;
		this.name=na;
		this.amount=am;
	}
	public void useAtm()
	{
		atm.CheckBalance(name);
		atm.Withdraw(name, amount);
	}
	public void run()
	{
//way 1 of synchronization
             synchronized(atm)
{
		useAtm();
}
	}
}
public class TestSynchronization {

	public static void main(String[] args)
	{
		Atm a=new Atm();
		Customer c1=new Customer(a,"ravi",2000);
		Customer c2=new Customer(a,"kumar",3000);
		c1.start();
		c2.start();
	}

}
