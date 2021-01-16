package pack1;

public class ThreadTest extends Thread
{
public void run()
{
int i=1;
while(i<6)
{
System.out.println(i+"Hello");
i++;
}
}
}