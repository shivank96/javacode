package mypack1;
import mypack1.TestPackageDemo1;
import mypack1.inner.TestPackageDemo2;
public class TestPackageDemo3
{
public static void main(String args[])
{
System.out.println("TestPackageDemo3");
TestPackageDemo1 d = new TestPackageDemo1();
d.display();
TestPackageDemo2 d1 = new TestPackageDemo2();
d1.display();
}
}
