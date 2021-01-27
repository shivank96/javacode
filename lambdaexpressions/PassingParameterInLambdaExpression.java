@FunctionalInterface
interface MyLambda
{
int add(int a,int b);
}
public class PassingParameterInLambdaExpression
{
public static void main(String args[])
{
MyLambda m=(a,b)->a+b;
System.out.println(m.add(5,10));
}
}