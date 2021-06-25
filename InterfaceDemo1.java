interface Maths1
{
	int Add (int no1, int no2);
}

interface Maths2
{
	int Sub(int no1, int no2);
}

class Demo implements Maths1, Maths2
{
	public int Add(int no1, int no2)
	{
		return no1+no2;
	}
	public int Sub(int no1, int no2)
	{
		return no1-no2;
	}
}

class InterfaceDemo1
{
	public static void main(String arg[])
	{
		Demo obj = new Demo();
		System.out.println("Addition is : "+obj.Add(10, 5));
		System.out.println("Substraction is : "+obj.Sub(15, 10));
	}
}