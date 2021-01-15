import java.io.*;
import java.util.*;

public class TryWithResourcesWithFinally
{
static FileInputStream fi;
static Scanner s;
static void divide() throws FileNotFoundException,IOException
{
fi=new FileInputStream("/path/Test.txt");
try
{
s=new Scanner(fi);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println(a/c);
}
finally
{
fi.close();
s.close();
}
}
public static void main(String args[]) throws Exception
{
try
{
divide();
}
catch(Exception e)
{
System.out.println(e);
}
int d=s.nextInt();
System.out.println(d);
}
}