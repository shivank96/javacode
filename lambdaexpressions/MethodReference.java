interface My
{
void display(String name);
}
interface MyOne
{
int display(String s1,String s2);
}
public class MethodReference
{
public MethodReference(String s)
{
System.out.println(s.toUpperCase());
}
public static void reverse(String s)
{
StringBuffer sb = new StringBuffer(s);
sb.reverse();
System.out.println(sb);
}
public static void main(String args[])
{
My m = System.out::println;//assigning a method to a reference for functional interface
m.display("Hello");//Method reference in the stativ context 
System.out.println("Reverse of string is");
My m1 = MethodReference::reverse;//assigning a method to a reference for functional interface
m1.display("Hello");//Method reference in the static context 
//or Method reference by creating object 
//MethodReference mr = new MethodReference();
//My m2 = mr::reverse;//method reference by creating object
//m2.display("World"); 
//assigning constructor to a reference for functional interface
My m3 = MethodReference::new;

m3.display("hello world");

MyOne mo=String::compareTo;
System.out.println(mo.display("hello","ello"));
}
}