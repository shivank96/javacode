@FunctionalInterface
interface MyLambda
{
void display();
}

public class LocalVariablesOutsideLambdaExpressions
{
public static void main(String args[])
{
int count=1;//Local Variables outside lambda expressions Where these should not be modified inside the methodcor they should be final
MyLambda m = ()->{
System.out.println("Overriding the method of interface");
System.out.println("An interface is said to be a functional interface if it has only single method in it");
System.out.println((count)+"Functional interface is used for working with lambda expressions");
};
m.display();
}
}