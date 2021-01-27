@FunctionalInterface
interface MyLambda
{
void display();
}

public class LambdaExpressionWithMethodName
{
public static void main(String args[])
{
MyLambda m =new MyLambda()
{
public void display()
{
System.out.println("Overriding the method of interface");
System.out.println("An interface is said to be a functional interface if it has only single method in it");
System.out.println("Functional interface is used for working with lambda expressions");
}
};
m.display();
}
}