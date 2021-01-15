import java.util.*;
class NegativeDimensionException extends Exception
{
public String toString()
{
return "Negative dimensions are not allowed";
}
}
class ZeroResultException extends Exception
{
public String toString()
{
return "Result cannot be zero";
}
}
abstract class Rectangle
{
private int len,breadth;
abstract int area() throws ZeroResultException;
void setLength(int len) throws NegativeDimensionException
{
if(len<0)
{
throw new NegativeDimensionException();
}
this.len=len;
}
void setBreadth(int breadth) throws NegativeDimensionException
{
if(breadth<0)
{
throw new NegativeDimensionException();
}
this.breadth=breadth; 
}
int getLength()
{
return len;
}
int getBreadth()
{
return breadth;
}
}
//class Rect 
//{
//}
class CustomExceptionUsingThrowThrows extends Rectangle
{
int area() throws ZeroResultException
{
if(getLength()<=0||getBreadth()<=0)
{throw new ZeroResultException();}
return getLength()*getBreadth();
}
public static void main(String []args) //throws NegativeDimensionException
{
Rectangle c = new Rect();
Scanner s=new Scanner(System.in);
System.out.println("Enter the length");
int l=s.nextInt();
try
{
c.setLength(l);
}
catch(NegativeDimensionException e)
{
System.out.println(e);
}
System.out.println("Enter the length");
int b=s.nextInt();
try
{
c.setBreadth(b);
}
catch(NegativeDimensionException e)
{
System.out.println(e);
}
try
{
System.out.println(c.area());
}
catch(ZeroResultException n)
{
System.out.println(n);
}
}
}