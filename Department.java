public class Department
{
	public static String departmentName="HR";
	public String employeeName;
	
	public static void main(String []args)
	{
		System.out.println("Department: "+departmentName);	
		Department obj1=new Department();
		obj1.employeeName="John";
		System.out.println("Employee 1: "+obj1.employeeName);

		Department obj2=new Department();
		obj2.employeeName="Alice";
		System.out.println("Employee 2: "+obj2.employeeName);

		System.out.println("After Modification :");
		
		obj1.departmentName="Marketing";
		System.out.println("Department: "+departmentName);
		System.out.println("Employee 1: "+obj1.employeeName);
		System.out.println("Employee 2: "+obj2.employeeName);
		
	}
}
		
		