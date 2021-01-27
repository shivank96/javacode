import java.lang.reflect.*;
//reflect package is a part of java.lang package which is used to pull the information of a class
class My
{
private int a;
protected int b;
public int c;
int d;

public My()
{
System.out.println("Default constructor");
}
public My(int a)
{
System.out.println("parameterized constructor");
}
public void Show()
{
System.out.println("show method");
}
public void Display()
{
System.out.println("Display method");
}
}
public class ReflectionDemo
{
public static void main(String args[])
{
//Creating reflection of a class without creating the object for the class
Class c=My.class;
//or Creating reflection of a class by creating the object for the class
//My m=new My();
//Class c1=m.getClass();
//To get the name of a class we use getName() method
System.out.println(c.getName());//returns class name
//To get the fields of a class
Field field[]=c.getDeclaredFields();
for(Field f:field)
	System.out.println(f);
//to get the constructors of a class
Constructor con[]=c.getConstructors();
for(Constructor co:con)
	System.out.println(co);
//to get the methods of a class
Method meth[]=c.getMethods();
for(Method me:meth)
	System.out.println(me);
//to get parameters of a method
Parameter param[]=meth[0].getParameters();
for(Parameter p:param)
	System.out.println(p);

}
}