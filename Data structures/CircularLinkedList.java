import java.lang.*;
import java.util.*;
class Node
{
int data;
Node next;
}
class CllOperations
{
Node last;
Scanner s = new Scanner(System.in);
CllOperations()
{
Node a=new Node();
System.out.println("Enter the data value");
a.data=s.nextInt();
a.next=a;

last=a;
}
void display()
{
Node t=last.next;
//System.out.println();
//System.out.println(t.data);
//t=t.next;
do
{
System.out.println(t.data);
t=t.next;
}while(t!=last);
}
void InsertAtLast()
{
Node n=new Node();
n.data=s.nextInt();
n.next=last.next;
last.next=n;

}
}
class CircularLinkedList
{
public static void main(String args[])
{
CllOperations cll = new CllOperations();
cll.display();
Node a;
System.out.println("Enter the data value");
Scanner s= new Scanner(System.in);
a=new Node();
a.data=s.nextInt();
cll.last.next=a;
a.next=cll.last;
cll.display();
Node b=new Node();
System.out.println("Enter the data value");
b.data=s.nextInt();
a.next=b;
b.next=cll.last;
cll.display();
cll.InsertAtLast();
System.out.println("  "+(cll.last.next.data));
cll.display();
}
}