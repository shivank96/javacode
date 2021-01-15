import java.io.*;
import java.util.*;

public class TryWithResourcesWithoutFinally
{
static void divide() throws FileNotFoundException,IOException
{
try(FileInputStream fi=new FileInputStream("path/Test.txt");Scanner s=new Scanner(fi))
{
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println(a/c);
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


}
}