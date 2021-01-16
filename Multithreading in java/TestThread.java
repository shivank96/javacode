package pack1;
import pack1.ThreadTest;
public class TestThread
{
public static void main(String args[])
{
ThreadTest t = new ThreadTest();
t.start();
int i=1;
while(i<6)
{
System.out.println(i+"World");
i++;
}
}
}