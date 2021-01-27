@FunctionalInterface
interface MyLambda
{
void display();
}
class UseLambda
{
public void callLambda(MyLambda ml)
{
ml.display();
}
}
class Demo
{
public void method1()
{
UseLambda ul = new UseLambda();
ul.callLambda(()->{
System.out.println("Overriding the method of interface");
System.out.println("An interface is said to be a functional interface if it has only single method in it");
System.out.println("Functional interface is used for working with lambda expressions");});
}
}
public class PassingLambdaExpressionAsParameter
{
public static void main(String args[])
{
Demo a = new Demo();
a.method1();
}
}