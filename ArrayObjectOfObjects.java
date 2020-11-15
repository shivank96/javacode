import java.util.*;
class Student
{
	private String name,rollno,phone;
	private String subject[]=new String[3];
	Student(String name,String rollno,String phone,String sub[])
	{
		this.name=name;
		this.rollno=rollno;
		this.phone=phone;
	    for(int i=0;i<subject.length;i++)
	    {
	    	this.subject[i]=sub[i];
	    }
	}
	public String toString()
	{
		return "student name "+name+"\n"+"rollno "+rollno+"\n"+"phone "+phone+"\n";//for(String a:subject)System.out.println("subject name "+a);
	}
	void displaySub()
	{
		for(String a:subject)
			System.out.println("subject name "+a);		
	}
}
public class ArrayObjectOfObjects {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s[]=new Student[3];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Student details");
			String n=sc.nextLine();
			String r=sc.nextLine();
			String ph=sc.nextLine();
			String s1[]=new String[3];
			for(int j=0;j<s1.length;j++)
			{
			System.out.println("Enter Student subject details");
			s1[j]=sc.nextLine();
			}
			s[i]=new Student(n,r,ph,s1);
		}
		for(Student m:s)
		{
			System.out.println(m);
		    m.displaySub();
		}	
	}
}
