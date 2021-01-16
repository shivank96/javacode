class MyThread extends Thread
{
public void run()
{
int i=1;
while(i<6)
{
System.out.println(i+"world");
i++;
}
}
}
public class MultithreadingUsingThreadClass
{
public static void main(String args[])
{
MyThread m=new MyThread();
m.start();
int i=1;
while(i<6)
{
System.out.println(i+"hello");
i++;
}
}
}
