@FunctionalInterface
interface MyLambda
{
void display();
}

public class LocalVariablesInLambdaExpressions
{
public static void main(String args[])
{
MyLambda m = ()->{
int count=1;//Local Variables inside lambda expressions
System.out.println((count++)+". Overriding the method of interface");
System.out.println((count++)+". An interface is said to be a functional interface if it has only single method in it");
System.out.println((count)+". Functional interface is used for working with lambda expressions");

};
m.display();
}
}