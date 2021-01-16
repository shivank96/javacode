public class MultiThreadingInOneClass extends Thread
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
public static void main(String args[])
{
MultiThreadingInOneClass m=new MultiThreadingInOneClass();
m.start();
int i=1;
while(i<6)
{
System.out.println(i+"hello");
i++;
}
}
}