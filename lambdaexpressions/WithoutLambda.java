@FunctionalInterface
interface My
{
void display();
}
class Demo implements My
{
public void display()
{
System.out.println("Overriding the method of interface");
System.out.println("An interface is said to be a functional interface if it has only single method in it");
System.out.println("Functional interface is used for working with lambda expressions");
}
}
public class WithoutLambda
{
public static void main(String args[])
{
Demo a = new Demo();
a.display();
}
}