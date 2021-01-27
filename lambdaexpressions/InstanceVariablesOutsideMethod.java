@FunctionalInterface
interface MyLambda
{
void display();
}
class Demo
{
int count=1;//Local Variables outside lambda expressions Where these should not be modified inside the methodcor they should be final
public void method()
{
MyLambda m = ()->{
System.out.println((count++)+". Overriding the method of interface");
System.out.println((count++)+". An interface is said to be a functional interface if it has only single method in it");
System.out.println((count)+". Functional interface is used for working with lambda expressions");
};
m.display();
}
}
public class InstanceVariablesOutsideMethod
{
public static void main(String args[])
{
Demo a = new Demo();
a.method();
}
}