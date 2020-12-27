import java.lang.*;
import java.util.*;

class Node
{
int data;
Node next;
}
class TestLinkedList
{
Node head,a;
Scanner s=new Scanner(System.in);
TestLinkedList()
{
a = new Node();
System.out.println("Enter the data value");
a.data=s.nextInt();
a.next=null;
head=a;
}
//Displaying the elements of a linked list by traversing
public void display()
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
//Inserting an element at the beginning of a linked list
public void InsertAtBeg()
{
Node a;
a=new Node();
System.out.println("Enter the data value which you want to insert at begining ");
a.data=s.nextInt();
a.next=head;
head=a;
}
//Inserting an element at the end in a linked list
public void InsertAtEnd()
{
Node a=new Node();
Node t=head;
System.out.println("Insert a value at the end");
while(t.next!=null)
{
t=t.next;
}
a.data=s.nextInt();
t.next=a;
a.next=null;
}
public void RecDisplay(Node h)
	{
		Node t=h;
		while(t==null)
		{
			return;
		}
		RecDisplay(t.next);
		System.out.println(h.data);
	}
	public void InsertAfter(int pos,int ele)
	{
		Node t=head;
		for(int i=0;i<pos;i++)
		{
			t=t.next;
		}
		Node a=new Node();
		a.data=ele;
		a.next=t.next;
		t.next=a;
	}
	public void Size()
	{
		Node t=head;
		int count=0;
		while(t!=null)
		{
			t=t.next;
			count++;
		}
		System.out.println("The size of the linked list is "+count);
	}
	public void delete()
	{
		System.out.println("Enter the data value of a node which you want to delete ");
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
	public void search()
	{
		System.out.println("Enter the element which you are searching for ");
		int ele=s.nextInt();
		Node t=head;
		int count=0;
		while(t!=null)
		{
			if(t.data==ele)
			{
				System.out.println("The value you are searching for is found at position "+(count+1));
				return;
			}
			else
			{
			count++;
			t=t.next;
			}
			if(t.data!=ele&&t.next==null)
			{
				System.out.println("sorry element not found ");
				break;
			}
		}	
	}
	public void SumOfAll()
	{
		Node t=head;
		int sum=0;
		while(t!=null)
		{
			sum+=t.data;
			t=t.next;
		}
		System.out.println("sum of all the elements is "+sum);
	}
	public void MaxInList()
	{
		Node t=head;
		int max=0;
		while(t!=null)
		{
			if(t.data>max)
			{
				max=t.data;
				t=t.next;
			}
		}
		System.out.println("maximum value is "+max);
	}
	public boolean CheckSorted()
	{
//		for(Node t=head;t.next!=null;t=t.next)
//		if(t.data<t.next.data)
//			return true;
//		return false;
		Node t=head;
        while(t.next!=null)
          {
            if(t.data>t.next.data)
              {
                 return false;
              }
            t=t.next;
          }
        return true;
	}
}

class LinkedList
{
	public static void main(String[] args) 
	{
		TestLinkedList tll = new TestLinkedList();
		tll.display();
		tll.Size();
		Scanner s=new Scanner(System.in);
		Node a,b;
		a=new Node();
		System.out.println("Enter the data value");
		a.data=s.nextInt();
                b=new Node();
                System.out.println("Enter the data value");
		b.data=s.nextInt();
		tll.head.next=a;
		a.next=b;
		b.next=null;
		tll.Size();
		tll.display();
		tll.InsertAtBeg();
		System.out.println("After inserting at begining");
		tll.display();
		tll.Size();
		tll.InsertAtEnd();;
		System.out.println("After inserting at end");
		tll.display();
		tll.Size();
		System.out.println("Recursive display");
		tll.RecDisplay(tll.head);
		tll.Size();
		System.out.println("Enter the element which you want to insert at middle ");
		int ele=s.nextInt();
		tll.InsertAfter(2, ele);
		System.out.println("After inserting at middle");
		tll.display();
		tll.Size();
		tll.delete();
		System.out.println("After deleting a node ");
		tll.display();
		tll.Size();
		tll.search();
		tll.SumOfAll();
		tll.MaxInList();
		if(tll.CheckSorted())
			System.out.println("sorted");
		else
			System.out.println("not sorted");
	}
}











