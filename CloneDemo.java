class Employee implements Cloneable
{
	public int Eid;
	public String Ename;

	public Employee(int x, String str)
	{
		this.Eid=x;
		this.Ename=str;
	}
	public Object clone() throws CloneNotSupportedException
	{
		// super()             to call base class constructor.
		// System.out.println(super.no)      to call base class characteristics

		return super.clone();            // to call base class method.
	}
}

class CloneDemo
{
	public static void main(String arg[]) throws Exception
	{
		Employee obj1 = new Employee(11, "Atharva");
		Employee obj2 =(Employee)obj1.clone();
		System.out.println("Employee id :"+obj2.Eid);
		System.out.println("Employee name :"+obj2.Ename);
	}
}