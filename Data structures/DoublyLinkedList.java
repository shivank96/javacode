import java.lang.*;
import java.util.*;
class Node
{
int data;
Node next,prev;
}
class TestDoublyLinkedList
{
Node head,a;
Scanner s= new Scanner(System.in);
TestDoublyLinkedList()
{
a=new Node();
System.out.println("Enter the data value");
a.data=s.nextInt();
a.prev=null;
a.next=null;
head=a;
}
void display()
{
Node t=head;
System.out.print("The values are ");
while(t!=null)
{
System.out.print(t.data+" ");
t=t.next;
}
System.out.println();
}
void InsertAtBeg(Node n)
{
n.next=head;
head.prev=n;
head=n;
}
void InsertAtEnd(Node n)
{
Node t=head;
while(t.next!=null)
{
t=t.next;
}
t.next=n;
n.prev=t;
}
void InsertAfter(Node n,int ele)
{
Node a=new Node();
a.data=ele;
a.next=n.next;
n.next=a;
a.prev=n;
}
void InsertBefore(int pos,int ele)
{
Node a=new Node();
Node t=head;
for(int i=0;i<pos;i++)
{
	t=t.next;
}
a.data=ele;
t.prev.next=a;
a.prev=t.prev;
t.prev=a;
a.next=t;
}
void delete()
{
System.out.println("Enter the element which you want to delete ");
int ele=s.nextInt();
Node t=head;
Node p=head;
if(head.data==ele)
{
head=head.next;
}
else
{
while(t!=null)
{
if(t.data==ele)
{
p.next=t.next;
break;
}
p=t;
t=t.next;
}
}
}
}
class DoublyLinkedList
{
public static void main(String args[])
{
TestDoublyLinkedList dll = new TestDoublyLinkedList();
Scanner s = new Scanner(System.in);
System.out.println("Enter the data value ");
Node a = new Node();
a.data=s.nextInt();
System.out.println("Enter the data value ");
Node b = new Node();
b.data=s.nextInt();
dll.head.next=a;
a.prev=dll.head;
a.next=b;
b.prev=a;
b.next=null;
dll.display();
System.out.println("Insert the data value at the beggining");
Node c = new Node();
c.data=s.nextInt();
dll.InsertAtBeg(c);
dll.display();
System.out.println("Insert the data value at the End");
Node d = new Node();
d.data=s.nextInt();
dll.InsertAtEnd(d);
dll.display();
dll.InsertAfter(b,33);
//System.out.println("After Inserting the data value at a given position ");
dll.display();
dll.delete();
dll.display();
dll.InsertBefore(2,44);
dll.display();
}
}