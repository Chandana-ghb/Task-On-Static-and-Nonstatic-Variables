public class Car
{
	public static String companyName="Honda";
	public String carModel="Civic";
	
	public static void main(String args[])
	{
		System.out.println("Company: "+companyName);
		Car obj1=new Car();
		System.out.println("Car 1 Model: "+obj1.carModel);

		Car obj2=new Car();
		obj2.carModel="Accord";
		System.out.println("Car 2 Model: "+obj2.carModel);
	}
}