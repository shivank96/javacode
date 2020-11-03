class commandLine
{
public static void main(String ...args)
{
double d=0;
for(String a:args)
{
if(a.matches("[0-9\\.]+"))
{
d=d+Double.parseDouble(a);
}

System.out.println(a+" ");
}
System.out.println(d+" ");
}
}

