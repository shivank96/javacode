import java.lang.*;

class BoxingUnboxing
{
public static void main(String args[])
{
int a=10;
Integer obj_a=Integer.valueOf(a);//Wrapping or Boxing
//Boxing means converting a primitive to an object
System.out.println(a);
System.out.println(obj_a);
System.out.println(obj_a.equals(a));
int a1=obj_a.intValue();//Unboxing
//Unboxing means converting an object to primitive
System.out.println(a1);
System.out.println(obj_a.equals(a));
}
}