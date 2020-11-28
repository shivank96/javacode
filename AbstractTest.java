abstract class shape
{
        int r,l,b;
        abstract public double Perimeter();
        abstract public double area();
}
class Circle extends shape
{
        @Override
        public double Perimeter()
        {
                return 2*Math.PI*r;
        }
        public double area()
        {
                return Math.PI*r*r;
        }
}
class Rectangle extends shape
{
        @Override
        public double Perimeter()
        {
                return 2*(l+b);
        }
        public double area()
        {
                return l*b;
        }
}
public class AbstractTest
{
        public static void main(String[] args)
        {
                shape s = new Circle();
                shape s1 = new Rectangle();
                s.r=5;
                s1.l=10;
                s1.b=10;
                System.out.println("Area of rectangle is "+s1.area());
                System.out.println("Area of circle is "+s.area());
                System.out.println("Perimeter of circle is "+s.Perimeter());
                System.out.println("Perimeter of circle is "+s1.Perimeter());
        }
}