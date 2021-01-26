public class EnumDemo
{
public static void main(String args[])
{
System.out.println(String.format("%s %10s %10s %10s","id","Deptname","Name","rollno"));
Dept d=Dept.CSE;
//System.out.println(d.ordinal()+"\n"+d);
Dept value[]=Dept.values();
//for(Dept x:value)
//{
//System.out.println(x);
//}
d.display();
}
}
enum Dept
{
CIVIL("john",111),IT("vikas",112),CSE("smith",113);
String name;
int rno;
//Dept()//enum constructor should be either default or private
//{
//System.out.println(this.name()+" "+this.ordinal());
//}
Dept(String name,int rno)
{
this.name=name;
this.rno=rno;

System.out.println(String.format("%s %10s %10s %10s",this.ordinal()+1,this.name(),this.name,this.rno));
}
public void display()//methods of enum should be public
{
//System.out.println(this.name()+" "+this.ordinal());
}
}