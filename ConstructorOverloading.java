class Product
{
	private String productId,name;
	private double price;
	private int quantity;
	
	Product()
	{
		productId="111A";
		name="Misc";
		price= 100.00;
		quantity=10;
	}
	Product(String Idno,String name)
	{
		 productId=Idno;
		 this.name=name;
	}
	Product(String Idno,String name,Double amount,int quant)
	{
		 productId=Idno;
		 this.name=name;
		 setPrice(amount);
		 setQuantity(quant);
	}
	void setPrice(double price)
	{
		if(price>0)
			this.price=price;
		else
			price=10;
	}
	void setQuantity(int quantity)
	{
		if(quantity>0)
			this.quantity=quantity;
		else
			quantity=1;
	}
	double getPrice()
	{
		return price;
	}
	int getQuantity()
	{
		return quantity;
	}
	String getName()
	{
		return name;
	}
	String getIdno()
	{
		return productId;
	}
}
public class ConstructorsOverloading {
	public static void main(String[] args) {
		Product p = new Product();
		Product p1= new Product("m31","Samsung");
		Product p2= new Product("m30","Samsung",12500.00,10);
		System.out.println(p.getPrice()+" "+p.getQuantity()+" "+p.getName()+" "+p.getIdno());
		System.out.println("Before setting price ");
		System.out.println(p2.getPrice()+" "+p2.getQuantity()+" "+p2.getName()+" "+p2.getIdno());
		p2.setPrice(11500.00);
		p2.setQuantity(p2.getQuantity()-1);
		System.out.println("After setting price ");
		System.out.println(p2.getPrice()+" "+p2.getQuantity()+" "+p2.getName()+" "+p2.getIdno());
		p1.setPrice(15000);
		p1.setQuantity(10);
		System.out.println(p1.getPrice()+" "+p1.getQuantity()+" "+p1.getName()+" "+p1.getIdno());
	}
}
