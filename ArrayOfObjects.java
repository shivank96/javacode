import java.util.*;
class Subject
{
	private String name,sid;
	private int maxmarks; 
	Subject(String name,String sid,int marks)
	{
		this.name=name;
		this.sid=sid;
		setMarks(marks);
	}
	void setMarks(int marks)
	{
		if(marks>0)
		{
			maxmarks=marks;
		}
		else
			maxmarks=0;
	}
	public String toString()
	{
		return "subject name:"+getName()+"\n"+"sid is:"+getSid()+"\n"+"maxmarks "+getMarks()+"\n";
	}
	String getName()
	{
		return name;
	}
	String getSid()
	{
		return sid;
	}
	int getMarks()
	{
		return maxmarks;
	}
}
public class ArrayOfObjects {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Subject s[]=new Subject[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter name,sid,marks ");
			String n=sc.nextLine();
			String id=sc.nextLine();
			int m=sc.nextInt();
			sc.nextLine();
			s[i]=new Subject(n,id,m);
		}
		for(Subject a:s)
			System.out.println(a);

	}
}
