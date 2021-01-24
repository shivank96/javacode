import java.lang.*;
class AutoBoxingAutoUnboxing
{
public static void main(String args[])
{
int m=10;
Integer n=m;//AutoBoxing
//Here Autoboxing implicitly calls primitivetype.valueOf(primitive_variable) 
//and thus automatically converts a primitive to an object
System.out.println(n+" "+m);
int l=n;//AutoUnboxing 
//Here AutoUnboxing implicitly calls primitivetypeValue() 
//and thus automatically converts an object to a primitive
System.out.println(n+" "+l);
}
}