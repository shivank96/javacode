class Mythread implements Runnable
{
public void run()
{
int i=1;
while(i<6)
{
System.out.println(i+"hello");
i++;
}
}
}
public class MultithreadingUsingRunnableInterface
{
public static void main(String args[])
{
Mythread m = new Mythread();
Thread t = new Thread(m);
t.start();
int i=1;
while(i<6)
{
System.out.println(i+"world");
i++;
}
}
}