class TryCatchFinally
{
static void method1()
{
method2();
}
static void method2()
{
try
{
System.out.println(10/0);
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("Finally block is used for cleaning-up code purpose i.e releasing resources");
}
}
public static void main(String args[])
{
method1();
}
}