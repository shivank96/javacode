public class CheckedUncheckedExceptions
{
static void function1()
{
try
{
System.out.println(10/0);
}
catch(Exception e)
{
System.out.println(e.getMessage());
System.out.println(e);
try
{
System.out.println(10/5);
}
catch(Exception a)
{
System.out.println(a);
}
}
}
static void function2()
{
function1();
}
public static void main(String ...a)
{
function2();
}
}