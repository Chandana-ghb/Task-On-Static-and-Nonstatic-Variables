public class Product
{
	public static String category="Electronics";
	public String productName;
	
	public static void main(String args[])
	{
		System.out.println("Category: "+category);
		Product obj1=new Product();
		obj1.productName="Laptop";
		System.out.println("Product 1 :"+obj1.productName);

		Product obj2=new Product();
		obj2.productName="Smartphone";
		System.out.println("Product 2 :"+obj2.productName);

	}
}